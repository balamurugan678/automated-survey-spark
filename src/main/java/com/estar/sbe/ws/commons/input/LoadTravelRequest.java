package com.estar.sbe.ws.commons.input;


/**
 * Created by Bala.
 */
public class LoadTravelRequest {

    private LoadTravelPassenger passenger;
    private TravelDateTime travelDateTime;
    private String eligibilityAfterSales;
    private String eligibilityMode;
    private String history;
    private String pnrReference;

    public LoadTravelPassenger getPassenger() {
        return passenger;
    }

    public void setPassenger(LoadTravelPassenger passenger) {
        this.passenger = passenger;
    }

    public TravelDateTime getTravelDateTime() {
        return travelDateTime;
    }

    public void setTravelDateTime(TravelDateTime travelDateTime) {
        this.travelDateTime = travelDateTime;
    }

    public String getEligibilityAfterSales() {
        return eligibilityAfterSales;
    }

    public void setEligibilityAfterSales(String eligibilityAfterSales) {
        this.eligibilityAfterSales = eligibilityAfterSales;
    }

    public String getEligibilityMode() {
        return eligibilityMode;
    }

    public void setEligibilityMode(String eligibilityMode) {
        this.eligibilityMode = eligibilityMode;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getPnrReference() {
        return pnrReference;
    }

    public void setPnrReference(String pnrReference) {
        this.pnrReference = pnrReference;
    }

}
