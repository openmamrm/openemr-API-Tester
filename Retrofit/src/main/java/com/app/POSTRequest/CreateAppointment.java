package com.app.POSTRequest;

import com.app.Response.AppointmentResponse;
import com.app.Response.PostAppointmentResponse;

import retrofit2.Call;

import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;



public interface CreateAppointment {
	
	@POST("/apis/default/api/patient/{patient_id}/appointment")
	Call<AppointmentResponse> postAppointmentResponses(
			@Path("patient_id") String patientId,
            @Header("accept") String acceptHeader,
            @Header("Authorization") String authorizationHeader,
            @Body PostAppointmentResponse appointmentRequest
    );
	
	
}
	
   





