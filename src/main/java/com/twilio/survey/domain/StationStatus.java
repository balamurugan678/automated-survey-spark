package com.twilio.survey.domain;

import java.util.List;

/**
 * Created by Bala.
 */
public class StationStatus {

    private String lead_text;
    private String last_updated;
    private List<Row> rows;

    public String getLead_text() {
        return lead_text;
    }

    public void setLead_text(String lead_text) {
        this.lead_text = lead_text;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }
}
