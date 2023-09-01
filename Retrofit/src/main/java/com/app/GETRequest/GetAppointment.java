package com.app.GETRequest;

import com.app.Response.AppointmentResponse;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;


public interface GetAppointment {

	@GET("/apis/default/api/patient/{patient_id}/appointment")
	Call <List<AppointmentResponse>>
	getAppointments(@Path("patient_id") String patientId,
            @Header("accept") String acceptHeader,
            @Header("Authorization") String authorizationHeader);


}
