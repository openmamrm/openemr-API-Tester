package com.app.Response;
import com.google.gson.annotations.SerializedName;
public class PostAppointmentResponse {
	
	
	    @SerializedName("pc_catid")
	    private String categoryId;

	   
		@SerializedName("pc_title")
	    private String title;

	    @SerializedName("pc_duration")
	    private String duration;

	    @SerializedName("pc_hometext")
	    private String homeText;

	    @SerializedName("pc_apptstatus")
	    private String appointmentStatus;

	    @SerializedName("pc_eventDate")
	    private String eventDate;

	    @SerializedName("pc_startTime")
	    private String startTime;

	    @SerializedName("pc_facility")
	    private String facility;

	    @SerializedName("pc_billing_location")
	    private String billingLocation;

	    @SerializedName("pc_aid")
	    private String appointmentId;

	    // getters and setters
	    public String getCategoryId() {
			return categoryId;
		}

		public void setCategoryId(String categoryId) {
			this.categoryId = categoryId;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDuration() {
			return duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getHomeText() {
			return homeText;
		}

		public void setHomeText(String homeText) {
			this.homeText = homeText;
		}

		public String getAppointmentStatus() {
			return appointmentStatus;
		}

		public void setAppointmentStatus(String appointmentStatus) {
			this.appointmentStatus = appointmentStatus;
		}

		public String getEventDate() {
			return eventDate;
		}

		public void setEventDate(String eventDate) {
			this.eventDate = eventDate;
		}

		public String getStartTime() {
			return startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getFacility() {
			return facility;
		}

		public void setFacility(String facility) {
			this.facility = facility;
		}

		public String getBillingLocation() {
			return billingLocation;
		}

		public void setBillingLocation(String billingLocation) {
			this.billingLocation = billingLocation;
		}

		public String getAppointmentId() {
			return appointmentId;
		}

		public void setAppointmentId(String appointmentId) {
			this.appointmentId = appointmentId;
		}

	


}
