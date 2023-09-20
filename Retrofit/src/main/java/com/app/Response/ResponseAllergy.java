package com.app.Response;

import com.google.gson.annotations.SerializedName;

public class ResponseAllergy {
    @SerializedName("title")
    private String title;

    @SerializedName("begdate")
    private String begdate;

    @SerializedName("enddate")
    private String enddate;

    // Getters
    public String getTitle() {
        return title;
    }

    public String getBegdate() {
        return begdate;
    }

    public String getEnddate() {
        return enddate;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setBegdate(String begdate) {
        this.begdate = begdate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }
}

