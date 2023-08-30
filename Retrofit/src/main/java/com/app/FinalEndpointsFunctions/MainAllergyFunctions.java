package com.app.FinalEndpointsFunctions;

import java.io.IOException;
import java.util.Scanner;

import com.app.GETRequest.*;
import com.app.POSTRequest.*;
import  com.app.Response.*;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class MainAllergyFunctions {
	public void getAllergies(String token) {
	    Retrofit retrofit = new Retrofit.Builder()
	        .baseUrl("")
	        .addConverterFactory(GsonConverterFactory.create())
	        .build();
	    GetAllergy getAllergy = retrofit.create(GetAllergy.class);
	    Call<ResponseAllergy> call = getAllergy.getAllergiesCall("","application/json","Bearer " + token);

	    call.enqueue(new Callback<ResponseAllergy>() {
	        @Override
	        public void onResponse(Call<ResponseAllergy> call, Response<ResponseAllergy> response) {
	            if (response.isSuccessful()) {
	            	System.out.println("Successfull Allergies");
	                ResponseAllergy allergies = response.body();
	                    System.out.println("title: " + allergies.getTitle());
	                    System.out.println("begdate: " + allergies.getBegdate());
	                    System.out.println("enddate: " + allergies.getEnddate());
	                
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
	        public void onFailure(Call<ResponseAllergy>call, Throwable t) {
	            // Handle network failure
	        	System.out.println("No Network in allergies");
	        	t.printStackTrace();
	        }
	    });
	}

	public void postAllergies(String token) {
	    Retrofit retrofit = new Retrofit.Builder()
	        .baseUrl("")
	        .addConverterFactory(GsonConverterFactory.create())
	        .build();
	    PostAllergy postAllergy = retrofit.create(PostAllergy.class);
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter title: ");
	    String title = scanner.nextLine();

	    System.out.print("Enter begdate (yyyy-mm-dd): ");
	    String begdate = scanner.nextLine();

	    System.out.print("Enter enddate (yyyy-mm-dd) or type 'null' if not applicable: ");
	    String enddateInput = scanner.nextLine();
	    String enddate = enddateInput.equalsIgnoreCase("null") ? null : enddateInput;

	    ResponseAllergy responseAllergy = new ResponseAllergy();
	    responseAllergy.setTitle(title);
	    responseAllergy.setBegdate(begdate);
	    responseAllergy.setEnddate(enddate);
scanner.close();
	    Call<ResponseAllergy> call = postAllergy.postAllergyCall("puuid", "application/json", "Bearer " + token, responseAllergy);

	    call.enqueue(new Callback<ResponseAllergy>() {
	        @Override
	        public void onResponse(Call<ResponseAllergy> call, Response<ResponseAllergy> response) {
	            if (response.isSuccessful()) {
	                ResponseAllergy allergyResponse = response.body();
	                System.out.println(allergyResponse);
	            } else {
	                // Handle error response
	            	System.out.println("Request Not");
	            }
	        }

	        @Override
	        public void onFailure(Call<ResponseAllergy> call, Throwable t) {
	            // Handle network failure
	        	System.out.println("No Network");
	        }
	    });
	}

}
