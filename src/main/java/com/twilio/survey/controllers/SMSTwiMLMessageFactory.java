package com.twilio.survey.controllers;

import com.estar.sbe.ws.commons.input.LoadTravelRequest;
import com.estar.sbe.ws.retrievepnr.output.JourneyRetrievePnrOutput;
import com.estar.sbe.ws.retrievepnr.output.LoadTravelOutput;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.survey.Server;
import com.twilio.survey.domain.Row;
import com.twilio.survey.domain.StationStatus;
import com.twilio.survey.models.Survey;
import com.twilio.survey.service.impl.BookingServiceImpl;
import com.twilio.survey.util.Question;
import com.twilio.twiml.*;
import com.twilio.type.PhoneNumber;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashMap;
import java.util.Optional;

public class SMSTwiMLMessageFactory extends AbstractMessageFactory {

    private static final HashMap<Integer, String> STATIONS = new HashMap<Integer, String>();

    private static final int STATION_CODE_LONDON = 7015400;
    private static final int STATION_CODE_PARIS = 8727100;
    private static final int STATION_CODE_BRUSSELS = 8814001;
    private static final int STATION_CODE_EBBSFLEET = 7015440;
    private static final int STATION_CODE_ASHFORD = 7054660;
    private static final int STATION_CODE_DISNEYLAND = 8711184;
    private static final int STATION_CODE_LILLE = 8722326;
    private static final int STATION_CODE_CALAIS = 8728107;

    static {
        STATIONS.put(STATION_CODE_LONDON,"London");
        STATIONS.put( STATION_CODE_PARIS,"Paris");
        STATIONS.put( STATION_CODE_BRUSSELS,"Brussels");
        STATIONS.put( STATION_CODE_EBBSFLEET,"Ebbsfleet");
        STATIONS.put( STATION_CODE_ASHFORD,"Ashford");
        STATIONS.put(STATION_CODE_DISNEYLAND,"Disneyland");
        STATIONS.put(STATION_CODE_LILLE,"Lille");
        STATIONS.put(STATION_CODE_CALAIS,"Calais");
    }

    public String goodByeTwiMLMessage(String selectedOption) throws TwiMLException {

        LoadTravelRequest loadTravelRequest = new LoadTravelRequest();
        loadTravelRequest.setPnrReference(selectedOption);
        LoadTravelOutput loadTravelOutput = null;
        BookingServiceImpl bookingService = new BookingServiceImpl();
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String loadTravelData =objectMapper.writeValueAsString(loadTravelRequest);

            loadTravelOutput = bookingService.getLoadTravel(loadTravelData, "http://localhost:8085/booking/travel", "GBZXA");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        JourneyRetrievePnrOutput outboundJourney = loadTravelOutput.getJourneyRetrievePnrOutputs().getJourneyRetrievePnrOutput().stream().filter(journeyRetrievePnrOutput -> journeyRetrievePnrOutput.isOutboundIndicator()).findFirst().get();
        Optional<JourneyRetrievePnrOutput> inboundJourney = loadTravelOutput.getJourneyRetrievePnrOutputs().getJourneyRetrievePnrOutput().stream().filter(journeyRetrievePnrOutput -> !journeyRetrievePnrOutput.isOutboundIndicator()).findFirst();
        StringBuilder message = new StringBuilder("Your PNR is " + selectedOption+ ". ");
        message.append("Your next train departs from "+getCityName(Integer.parseInt(outboundJourney.getOriginCode()))+" to "+getCityName(Integer.parseInt(outboundJourney.getDestinationCode())) +" at "+ outboundJourney.getDepartureDate().getTime()+" on "+outboundJourney.getDepartureDate().getDate()+". ");
        if(inboundJourney.isPresent()){
            message.append("Your return is from "+getCityName(Integer.parseInt(inboundJourney.get().getOriginCode()))+" to "+getCityName(Integer.parseInt(inboundJourney.get().getDestinationCode())) +" at "+ inboundJourney.get().getDepartureDate().getTime()+" on "+inboundJourney.get().getDepartureDate().getDate()+". ");
        }


        message.append("Enjoy your journey with Eurostar!");
        MessagingResponse.Builder messagingResponse = new MessagingResponse.Builder()
                .message(new Message.Builder()
                        .body(new Body(message.toString()))
                        .build());

        /*Message messagesfsaf = Message
                .creator(new PhoneNumber("+15558675309"), new PhoneNumber("+15017250604"),
                        "This is the ship that made the Kessel Run in fourteen parsecs?")
                .setMediaUrl("https://c1.staticflickr.com/3/2899/14341091933_1e92e62d12_b.jpg")
                .create();*/

        Message mmsMessage = new Message.Builder().media(new Media("https://c1.staticflickr.com/3/2899/14341091933_1e92e62d12_b.jpg")).build();

        MessagingResponse.Builder mmsmessagingResponse = new MessagingResponse.Builder()
                .message(mmsMessage);

        MessagingResponse.Builder twiMLResponseBuilder =
                messagingResponse == null ? new MessagingResponse.Builder() : messagingResponse;


        if(findDepartureWithin24Hours(outboundJourney.getDepartureDate().getDate(),outboundJourney.getDepartureDate().getTime())){
            StationStatus result = bookingService.getTrainDepartureTimes(outboundJourney.getOriginCode());
            Optional<Row> optionalRow = result.getRows().stream().
                    filter(row -> row.getNumber().equalsIgnoreCase(outboundJourney.getTravelSegments().getTravelSegment().get(0).getMarketingTrainNumber())).findFirst();
            Row selectedRow = optionalRow.get();
            twiMLResponseBuilder = twiMLResponseBuilder
                    .message(new Message.Builder()
                            .body(new Body("Your train number from "+ selectedRow.getJourney()+" is "+ selectedRow.getNumber()+" and it is running "+ selectedRow.getStatus()))
                            .build());
        }


        return mmsmessagingResponse.build().toXml();
    }


    public Boolean findDepartureWithin24Hours(String sbeDate, String sbeTime){
        DateFormat readFormat = new SimpleDateFormat( "dd/MM/yyyy HH:mm");
        Boolean within24Hours = false;
        try{
            Date sbe24Date = readFormat.parse(sbeDate + " "+sbeTime);
            Instant then = sbe24Date.toInstant();
            Instant now = Instant.now();
            Instant twentyFourHoursEarlier = now.plus( 24 , ChronoUnit.HOURS );
            within24Hours= (then.isAfter(now) && then.isBefore( twentyFourHoursEarlier ) ) ;
            System.out.println(within24Hours);
        } catch (ParseException pe){
            pe.printStackTrace();
        }
        return within24Hours;
    }

    public String getCityName(Integer cityCode){
        String cityName = "London";
        if (STATIONS.containsKey(cityCode)) {
            cityName = String.valueOf(STATIONS.get(cityCode));
        }
        return cityName;
    }

    public String firstTwiMLQuestion(Survey survey) throws TwiMLException {
        MessagingResponse.Builder messagingResponseBuilder = new MessagingResponse.Builder()
                .message(new Message.Builder()
                        .body(new Body("Thanks for contacting Eurostar."))
                        .build());

        Message mmsMessage = new Message.Builder().media(new Media("https://c1.staticflickr.com/3/2899/14341091933_1e92e62d12_b.jpg")).build();

        MessagingResponse.Builder mmsmessagingResponse = new MessagingResponse.Builder()
                .message(mmsMessage);

        return nextTwimlQuestion(survey, mmsmessagingResponse);
    }

    public String nextTwiMLQuestion(Survey survey) throws TwiMLException {
        return nextTwimlQuestion(survey, null);
    }

    private String nextTwimlQuestion(Survey survey, MessagingResponse.Builder baseResponseBuilder)
            throws TwiMLException {
        Question question = Server.config.getQuestions()[survey.getIndex()];

        MessagingResponse.Builder twiMLResponseBuilder =
                baseResponseBuilder == null ? new MessagingResponse.Builder() : baseResponseBuilder;

        twiMLResponseBuilder = twiMLResponseBuilder
                .message(new Message.Builder()
                        .body(new Body(question.getText()))
                        .build());

        return twiMLResponseBuilder.build().toXml();
    }
}
