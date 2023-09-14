package com.app.Response;

import com.google.gson.annotations.SerializedName;

public class ResponseMedication {

    @SerializedName("title")
    private String title;

    @SerializedName("begdate")
    private String begdate;

    @SerializedName("enddate")
    private String enddate;

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for begdate
    public String getBegdate() {
        return begdate;
    }

    // Setter for begdate
    public void setBegdate(String begdate) {
        this.begdate = begdate;
    }

    // Getter for enddate
    public String getEnddate() {
        return enddate;
    }

    // Setter for enddate
    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }
}
