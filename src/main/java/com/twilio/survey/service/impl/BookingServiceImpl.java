package com.twilio.survey.service.impl;

import com.estar.sbe.ws.retrievepnr.output.LoadTravelOutput;
import com.twilio.survey.domain.StationStatus;
import com.twilio.survey.service.BookingService;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Bala.
 */
public class BookingServiceImpl  {

    public LoadTravelOutput getLoadTravel(String request, String endpoint, String pos){
        CloseableHttpClient httpClient = HttpClients.custom().setSSLHostnameVerifier(new NoopHostnameVerifier()).build();
        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        requestFactory.setHttpClient(httpClient);

        RestTemplate restTemplate = new RestTemplate(requestFactory);

        List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
        acceptableMediaTypes.add(MediaType.APPLICATION_JSON);

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(acceptableMediaTypes);
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("cid", UUID.randomUUID().toString());


        HttpEntity<String> entity = new HttpEntity<String>(request, headers);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(endpoint)
                .queryParam("pos",  pos);

        ResponseEntity<LoadTravelOutput> loadTravelOutputResponse = restTemplate.exchange(builder.build().encode().toUri(), HttpMethod.POST, entity, LoadTravelOutput.class);
        return loadTravelOutputResponse.getBody();
    }


    public StationStatus getTrainDepartureTimes(String cityCode) {
        String endpoint = "http://www.eurostar.com/uk-en/js/station-board/DEP/"+cityCode;
        CloseableHttpClient httpClient = HttpClients.custom().setSSLHostnameVerifier(new NoopHostnameVerifier()).build();
        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        requestFactory.setHttpClient(httpClient);

        RestTemplate restTemplate = new RestTemplate(requestFactory);



        StationStatus result = restTemplate.getForObject(endpoint, StationStatus.class);
        return result;
    }


}
