package com.app.Response;

import com.google.gson.annotations.SerializedName;

public class EncounterResponse {
	

    @SerializedName("uuid")
    private String uuid;
    
    @SerializedName("encounter")
    private String encounterId;
	
	    @SerializedName("date")
	    private String date;

	    @SerializedName("onset_date")
	    private String onsetDate;

	    @SerializedName("reason")
	    private String reason;

	    @SerializedName("facility")
	    private String facility;

	    @SerializedName("pc_catid")
	    private String pcCatid;

	    @SerializedName("facility_id")
	    private String facilityId;

	    @SerializedName("billing_facility")
	    private String billingFacility;

	    @SerializedName("sensitivity")
	    private String sensitivity;

	    @SerializedName("referral_source")
	    private String referralSource;

	    @SerializedName("pos_code")
	    private String posCode;

	    @SerializedName("external_id")
	    private String externalId;

	    @SerializedName("provider_id")
	    private String providerId;

	    @SerializedName("class_code")
	    private String classCode;

	    // Getters
	    public String getDate() {
	        return date;
	    }

	    public String getOnsetDate() {
	        return onsetDate;
	    }

	    public String getReason() {
	        return reason;
	    }

	    public String getFacility() {
	        return facility;
	    }

	    public String getPcCatid() {
	        return pcCatid;
	    }

	    public String getFacilityId() {
	        return facilityId;
	    }

	    public String getBillingFacility() {
	        return billingFacility;
	    }

	    public String getSensitivity() {
	        return sensitivity;
	    }

	    public String getReferralSource() {
	        return referralSource;
	    }

	    public String getPosCode() {
	        return posCode;
	    }

	    public String getExternalId() {
	        return externalId;
	    }

	    public String getProviderId() {
	        return providerId;
	    }

	    public String getClassCode() {
	        return classCode;
	    }

	    // Setters
	    public void setDate(String date) {
	        this.date = date;
	    }

	    public void setOnsetDate(String onsetDate) {
	        this.onsetDate = onsetDate;
	    }

	    public void setReason(String reason) {
	        this.reason = reason;
	    }

	    public void setFacility(String facility) {
	        this.facility = facility;
	    }

	    public void setPcCatid(String pcCatid) {
	        this.pcCatid = pcCatid;
	    }

	    public void setFacilityId(String facilityId) {
	        this.facilityId = facilityId;
	    }

	    public void setBillingFacility(String billingFacility) {
	        this.billingFacility = billingFacility;
	    }

	    public void setSensitivity(String sensitivity) {
	        this.sensitivity = sensitivity;
	    }

	    public void setReferralSource(String referralSource) {
	        this.referralSource = referralSource;
	    }

	    public void setPosCode(String posCode) {
	        this.posCode = posCode;
	    }

	    public void setExternalId(String externalId) {
	        this.externalId = externalId;
	    }

	    public void setProviderId(String providerId) {
	        this.providerId = providerId;
	    }

	    public void setClassCode(String classCode) {
	        this.classCode = classCode;
	    }
	    public String getUuid() {
	        return uuid;
	    }

	 
	    public void setUuid(String uuid) {
	        this.uuid = uuid;
	    }

		public String getEncounterId() {
			return encounterId;
		}

		public void setEncounterId(String encounterId) {
			this.encounterId = encounterId;
		}
}
