package com.app.FinalEndpointsFunctions;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.Scanner;
import java.util.List;
import com.app.GETRequest.*;
import com.app.POSTRequest.*;
import com.app.Response.*;

public class MainEncounterClass {
	public void getEncounters(String token) {
	    Retrofit retrofit = new Retrofit.Builder()
	        .baseUrl("")
	        .addConverterFactory(GsonConverterFactory.create())
	        .build();
	    GetEncounter getEncounter = retrofit.create(GetEncounter.class);
	    Call<List<EncounterResponse>> call = getEncounter.getEncounterCall("9895c3ba-afc2-4764-a363-cf77f8f14a44", "application/json", "Bearer " + token);

	    call.enqueue(new Callback<List<EncounterResponse>>() {
	        @Override
	        public void onResponse(Call<List<EncounterResponse>> call, Response<List<EncounterResponse>> response) {
	            if (response.isSuccessful()) {
	                List<EncounterResponse> encounters = response.body();
	                for (EncounterResponse encounter : encounters) {
	                    System.out.println("date: " + encounter.getDate());
	                    // Print other fields if needed
	                }
	            } else {
	                // Handle error response
	            	System.out.println("Request Not");
	            }
	        }

	        @Override
	        public void onFailure(Call<List<EncounterResponse>> call, Throwable t) {
	            // Handle network failure
	        	System.out.println("No Network");
	        }
	    });
	}

	public void postEncounters(String token) {
	    Retrofit retrofit = new Retrofit.Builder()
	        .baseUrl("")
	        .addConverterFactory(GsonConverterFactory.create())
	        .build();
	    PostEncounter postEncounter = retrofit.create(PostEncounter.class);
	    Scanner scanner = new Scanner(System.in);

	    
	    EncounterResponse encounterRequest = new EncounterResponse();

	    System.out.print("Enter date (yyyy-mm-dd) or type 'null' if not applicable: ");
	    String dateInput = scanner.nextLine();
	    String date = dateInput.equalsIgnoreCase("null") ? null : dateInput;
	    encounterRequest.setDate(date);

	    System.out.print("Enter onset date (yyyy-mm-dd) or type 'null' if not applicable: ");
	    String onsetDateInput = scanner.nextLine();
	    String onsetDate = onsetDateInput.equalsIgnoreCase("null") ? null : onsetDateInput;
	    encounterRequest.setOnsetDate(onsetDate);

	    System.out.print("Enter reason or type 'null' if not applicable: ");
	    String reason = scanner.nextLine();
	    encounterRequest.setReason(reason.equalsIgnoreCase("null") ? null : reason);

	    System.out.print("Enter facility or type 'null' if not applicable: ");
	    String facility = scanner.nextLine();
	    encounterRequest.setFacility(facility.equalsIgnoreCase("null") ? null : facility);

	    System.out.print("Enter pc_catid or type 'null' if not applicable: ");
	    String pcCatid = scanner.nextLine();
	    encounterRequest.setPcCatid(pcCatid.equalsIgnoreCase("null") ? null : pcCatid);

	    System.out.print("Enter facility_id or type 'null' if not applicable: ");
	    String facilityId = scanner.nextLine();
	    encounterRequest.setFacilityId(facilityId.equalsIgnoreCase("null") ? null : facilityId);

	    System.out.print("Enter billing_facility or type 'null' if not applicable: ");
	    String billingFacility = scanner.nextLine();
	    encounterRequest.setBillingFacility(billingFacility.equalsIgnoreCase("null") ? null : billingFacility);

	    System.out.print("Enter sensitivity or type 'null' if not applicable: ");
	    String sensitivity = scanner.nextLine();
	    encounterRequest.setSensitivity(sensitivity.equalsIgnoreCase("null") ? null : sensitivity);

	    System.out.print("Enter referral_source or type 'null' if not applicable: ");
	    String referralSource = scanner.nextLine();
	    encounterRequest.setReferralSource(referralSource.equalsIgnoreCase("null") ? null : referralSource);

	    System.out.print("Enter pos_code or type 'null' if not applicable: ");
	    String posCode = scanner.nextLine();
	    encounterRequest.setPosCode(posCode.equalsIgnoreCase("null") ? null : posCode);

	    System.out.print("Enter external_id or type 'null' if not applicable: ");
	    String externalId = scanner.nextLine();
	    encounterRequest.setExternalId(externalId.equalsIgnoreCase("null") ? null : externalId);

	    System.out.print("Enter provider_id or type 'null' if not applicable: ");
	    String providerId = scanner.nextLine();
	    encounterRequest.setProviderId(providerId.equalsIgnoreCase("null") ? null : providerId);

	    System.out.print("Enter class_code or type 'null' if not applicable: ");
	    String classCode = scanner.nextLine();
	    encounterRequest.setClassCode(classCode.equalsIgnoreCase("null") ? null : classCode);


	    scanner.close();

	    Call<EncounterResponse> call = postEncounter.postEncounter("", "application/json", "application/json", "Bearer " + token, encounterRequest);

	    call.enqueue(new Callback<EncounterResponse>() {
	        @Override
	        public void onResponse(Call<EncounterResponse> call, Response<EncounterResponse> response) {
	            if (response.isSuccessful()) {
	                EncounterResponse encounterResponse = response.body();
	                System.out.println(encounterResponse);
	            } else {
	                // Handle error response
	            	System.out.println("Request Not");
	            }
	        }

	        @Override
	        public void onFailure(Call<EncounterResponse> call, Throwable t) {
	            // Handle network failure
	        	System.out.println("No Network");
	        }
	    });
	}

	
	

}

