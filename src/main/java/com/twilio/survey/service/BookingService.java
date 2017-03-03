package com.twilio.survey.service;

import com.estar.sbe.ws.retrievepnr.output.LoadTravelOutput;

/**
 * Created by Bala.
 */
public interface BookingService {

    LoadTravelOutput getLoadTravel(String request, String endpoint, String pos);
}
