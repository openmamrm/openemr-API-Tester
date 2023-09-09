package com.app.FinalEndpointsFunctions;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.Scanner;
import java.io.IOException;
import java.util.List;
import com.app.GETRequest.*;
import com.app.POSTRequest.*;
import com.app.Response.*;

public class MainMedications {
	public void getMedications(String token) {
	    Retrofit retrofit = new Retrofit.Builder()
	        .baseUrl("")
	        .addConverterFactory(GsonConverterFactory.create())
	        .build();
	    GetMedications getMedications = retrofit.create(GetMedications.class);
	    Call<List<ResponseMedication>> call = getMedications.getMedications("1", "application/json", "Bearer " + token);

	    call.enqueue(new Callback<List<ResponseMedication>>() {
	        @Override
	        public void onResponse(Call<List<ResponseMedication>> call, Response<List<ResponseMedication>> response) {
	            if (response.isSuccessful()) {
	                List<ResponseMedication> medications = response.body();
	                for (ResponseMedication medication : medications) {
	                    System.out.println("title: " + medication.getTitle());
	                    // Print other fields if needed
	                }
	            } else {
	                // Handle error response
	            	System.out.println("Request Not");
	            	
	        	    String errorBody;
						try {
							errorBody = response.errorBody().string();
							System.out.println("Error response body: " + errorBody);
						} catch (IOException e) {
							 //TODO Auto-generated catch block
							e.printStackTrace();
						}
	            }
	        }

	        @Override
	        public void onFailure(Call<List<ResponseMedication>> call, Throwable t) {
	            // Handle network failure
	        	System.out.println("No Network");
	        }
	    });
	}
	public void postMedications(String token) {
	    Retrofit retrofit = new Retrofit.Builder()
	        .baseUrl("")
	        .addConverterFactory(GsonConverterFactory.create())
	        .build();
	    PostMedication postMedication = retrofit.create(PostMedication.class);
	    Scanner scanner = new Scanner(System.in);

	    ResponseMedication medicationRequest = new ResponseMedication();

	    System.out.print("Enter title or type 'null' if not applicable: ");
	    String title = scanner.nextLine();
	    medicationRequest.setTitle(title.equalsIgnoreCase("null") ? null : title);

	    System.out.print("Enter begdate (yyyy-mm-dd) or type 'null' if not applicable: ");
	    String begDateInput = scanner.nextLine();
	    String begdate = begDateInput.equalsIgnoreCase("null") ? null : begDateInput;
	    medicationRequest.setBegdate(begdate);

	    System.out.print("Enter enddate (yyyy-mm-dd) or type 'null' if not applicable: ");
	    String endDateInput = scanner.nextLine();
	    String enddate = endDateInput.equalsIgnoreCase("null") ? null : endDateInput;
	    medicationRequest.setEnddate(enddate);

	    scanner.close();

	    Call<ResponseMedication> call = postMedication.postMedications("1", "application/json","Bearer " + token, medicationRequest);

	    call.enqueue(new Callback<ResponseMedication>() {
	        @Override
	        public void onResponse(Call<ResponseMedication> call, Response<ResponseMedication> response) {
	            if (response.isSuccessful()) {
	                ResponseMedication medicationResponse = response.body();
	                System.out.println(medicationResponse);
	            } else {
	                // Handle error response
	            	System.out.println("Request Not");
	            }
	        }

	        @Override
	        public void onFailure(Call<ResponseMedication> call, Throwable t) {
	            // Handle network failure
	        	System.out.println("No Network");
	        }
	    });
	}
//testing

}
