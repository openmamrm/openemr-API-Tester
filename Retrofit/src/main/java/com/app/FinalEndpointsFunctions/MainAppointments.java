package com.app.FinalEndpointsFunctions;

import java.io.IOException;
import com.app.POSTRequest.*;
import java.util.List;

import com.app.GETRequest.GetAppointment;
import com.app.Response.AppointmentResponse;
import com.app.Response.PostAppointmentResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.Scanner;

public class MainAppointments {
	public void GetAppointments(String token) {
		Retrofit retrofit = new Retrofit.Builder()
	            .baseUrl("")
	            .addConverterFactory(GsonConverterFactory.create())
	            .build();
		GetAppointment getAppointment = retrofit.create(GetAppointment.class);
		Call <List<AppointmentResponse>>call = getAppointment.getAppointments(
		        "1",
		        "application/json",
		        "Bearer" + token
		);

		
		 call.enqueue(new Callback<List<AppointmentResponse>>() {
		        @Override
		        public void onResponse(Call<List<AppointmentResponse>> call, Response<List<AppointmentResponse>> response) {
		            if (response.isSuccessful()) {
		        	 
		        	 List<AppointmentResponse> appointments = response.body();
		             for (AppointmentResponse appointment : appointments) {
		                 String pcEventDate = appointment.getPcEventDate();
		                 System.out.println("pc_eventDate: " + pcEventDate);
		             }
		              //Handle the successful response, e.g., update UI or store data
		         } else {
		              //Handle the error response, e.g., display an error message
		        	 System.out.println("Request Not");
		        	    String errorBody;
							try {
								errorBody = response.errorBody().string();
								System.out.println("Error response body: " + errorBody);
							} catch (IOException e) {
								
								e.printStackTrace();
							}
		        	    
		         }
		     }
		
		     @Override
		     public void onFailure(Call<List<AppointmentResponse>> call, Throwable t) {
		           //Handle the failure, e.g., log the error or display a message
		    	 System.out.println("No Network");
		     }
		 });
	}
	
	public void createAppointments(String token) {
		Retrofit retrofit = new Retrofit.Builder()
	            .baseUrl("")
	            .addConverterFactory(GsonConverterFactory.create())
	            .build();
		CreateAppointment anappointment = retrofit.create(CreateAppointment.class);
		Scanner scanner = new Scanner(System.in);

		PostAppointmentResponse appointmentRequest = new PostAppointmentResponse();

		System.out.println("Enter Category ID:");
		String categoryId = scanner.nextLine();
		appointmentRequest.setCategoryId(categoryId);

		System.out.println("Enter Title:");
		String title = scanner.nextLine();
		appointmentRequest.setTitle(title);

		System.out.println("Enter Duration:");
		String duration = scanner.nextLine();
		appointmentRequest.setDuration(duration);

		System.out.println("Enter Home Text:");
		String homeText = scanner.nextLine();
		appointmentRequest.setHomeText(homeText);

		System.out.println("Enter Appointment Status:");
		String appointmentStatus = scanner.nextLine();
		appointmentRequest.setAppointmentStatus(appointmentStatus);

		System.out.println("Enter Event Date (YYYY-MM-DD):");
		String eventDate = scanner.nextLine();
		appointmentRequest.setEventDate(eventDate);

		System.out.println("Enter Start Time (HH:mm):");
		String startTime = scanner.nextLine();
		appointmentRequest.setStartTime(startTime);

		System.out.println("Enter Facility:");
		String facility = scanner.nextLine();
		appointmentRequest.setFacility(facility);

		System.out.println("Enter Billing Location:");
		String billingLocation = scanner.nextLine();
		appointmentRequest.setBillingLocation(billingLocation);

		System.out.println("Enter Appointment ID:");
		String appointmentId = scanner.nextLine();
		appointmentRequest.setAppointmentId(appointmentId);
		scanner.close();
		
		Call <AppointmentResponse> call = anappointment.postAppointmentResponses("1", "application/json", token,appointmentRequest );
		call.enqueue(new Callback<AppointmentResponse>() {
	      @Override
	      public void onResponse(Call<AppointmentResponse> call, Response<AppointmentResponse> response) {
	          if (response.isSuccessful()) {
	         	 
	         	 AppointmentResponse appointmentResponse = response.body();
	         	 System.out.println(appointmentResponse);
	              // Handle the successful response, e.g., update UI or store data
	          } else {
	              // Handle the error response, e.g., display an error message
	         	 System.out.println("Request Not");
	         	    String errorBody;
						try {
							errorBody = response.errorBody().string();
							System.out.println("Error response body: " + errorBody);
						} catch (IOException e) {
							e.printStackTrace();
						}
	         	    
	          }
	      }
	
	      @Override
	      public void onFailure(Call<AppointmentResponse> call, Throwable t) {
	          // Handle the failure, e.g., log the error or display a message
	     	 System.out.println("No Network");
	      }
	  });
	}


}
