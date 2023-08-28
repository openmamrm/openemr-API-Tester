package com.app.Main;



import com.app.AuthenticationPanel.AuthCallback;
import com.app.FinalEndpointsFunctions.*;
import com.app.AuthenticationPanel.AuthMain;

public class MainCode {
		
		    
	 public static void main(String[] args) {
	
	        //main code	
		 //MainCode mainCode = new MainCode();
		 AuthMain authen = new AuthMain();
		 
		 authen.getBearer(new AuthCallback() {
		     @Override
		     public void onTokenReceived(String token) {
		    	 System.out.println("Running");  
		    	 System.out.println(token);
		    	 MainMedications medications = new MainMedications();
		    	 medications.getMedications(token);
		    	
		     }

		     @Override
		     public void onError(Throwable t) {
		         // Handle the error here
		    	 System.out.println("Main Code Error");
		     }
		     public void onNewBearer(String bearerToken) {
		    	 System.out.println("Running Bearer");
		   
		    	
		    	 //allergyFunctions.postAllergies(bearerToken);
		    	 
//		    	    System.out.println("Running Bearer");
//		    	    System.out.println(bearerToken);
//
//		    	    int option;
//		    	    Scanner scanner = new Scanner(System.in);
//
//		    	    do {
//		    	        System.out.println("Choose an option:");
//		    	        System.out.println("1. Get Allergies");
//		    	        System.out.println("2. Post Allergies");
//		    	        System.out.println("3. Get Appointments");
//		    	        System.out.println("4. Create Appointments");
//		    	        System.out.println("5. Get Encounters");
//		    	        System.out.println("6. Post Encounters");
//		    	        System.out.println("7. Get Medical Problems");
//		    	        System.out.println("8. Post Medical Problems");
//		    	        System.out.println("9. Get Medications");
//		    	        System.out.println("10. Post Medications");
//		    	        System.out.println("11. Get Patient Details");
//		    	        System.out.println("0. Exit");
//
//		    	        option = scanner.nextInt();
//
//		    	        MainAllergyFunctions allergyFunctions = new MainAllergyFunctions();
//		    	        MainAppointments appointments = new MainAppointments();
//		    	        MainEncounterClass encounterClass = new MainEncounterClass();
//		    	        MainMedicalProblem medicalProblem = new MainMedicalProblem();
//		    	        MainMedications medications = new MainMedications();
//		    	        MainPatientPortal patientPortal = new MainPatientPortal();
//
//		    	        switch (option) {
//		    	            case 1:
//		    	                allergyFunctions.getAllergies(bearerToken);
//		    	                break;
//		    	            case 2:
//		    	                allergyFunctions.postAllergies(bearerToken);
//		    	                break;
//		    	            case 3:
//		    	                appointments.GetAppointments(bearerToken);
//		    	                break;
//		    	            case 4:
//		    	                appointments.createAppointments(bearerToken);
//		    	                break;
//		    	            case 5:
//		    	                encounterClass.getEncounters(bearerToken);
//		    	                break;
//		    	            case 6:
//		    	                encounterClass.postEncounters(bearerToken);
//		    	                break;
//		    	            case 7:
//		    	                medicalProblem.getMedicalProblems(bearerToken);
//		    	                break;
//		    	            case 8:
//		    	                medicalProblem.postMedicalProblems(bearerToken);
//		    	                break;
//		    	            case 9:
//		    	                medications.getMedications(bearerToken);
//		    	                break;
//		    	            case 10:
//		    	                medications.postMedications(bearerToken);
//		    	                break;
//		    	            case 11:
//		    	                patientPortal.getPatientDetails(bearerToken);
//		    	                break;
//		    	            case 0:
//		    	                System.out.println("Exiting...");
//		    	                break;
//		    	            default:
//		    	                System.out.println("Invalid option. Please try again.");
//		    	        }
//		    	    } while (option != 0);
//
//		    	    scanner.close();
		    	}

		 });
		
	    

	 }
}

////Construct the URL for the API endpoint
//String baseUrl = "https://example.com/";
//String patientId = "123";
//String endpoint = "appointments/" + patientId;
//
////Set up the request headers
//String acceptHeader = "application/json";
//Map<String, String> headers = new HashMap<>();
//headers.put("accept", acceptHeader);
//
////Create an instance of the Retrofit interface
//Retrofit retrofit = new Retrofit.Builder()
//     .baseUrl(baseUrl)
//     .build();
//AppointmentService appointmentService = retrofit.create(AppointmentService.class);
//
////Call the getAppointments() method on the Retrofit instance
//Call<AppointmentResponse> call = appointmentService.getAppointments(
//     patientId,
//     acceptHeader,
//     "pc_catid_value",
//     "pc_title_value",
//     "pc_duration_value",
//     "pc_hometext_value",
//     "pc_apptstatus_value",
//     "pc_eventDate_value",
//     "pc_startTime_value",
//     "pc_facility_value",
//     "pc_billing_location_value",
//     "pc_aid_value"
//);
//
////Handle the response returned by the API
//call.enqueue(new Callback<AppointmentResponse>() {
// @Override
// public void onResponse(Call<AppointmentResponse> call, Response<AppointmentResponse> response) {
//     if (response.isSuccessful()) {
//         AppointmentResponse appointmentResponse = response.body();
//         // handle appointmentResponse
//     } else {
//         // handle unsuccessful response
//     }
// }
//
// @Override
// public void onFailure(Call<AppointmentResponse> call, Throwable t) {
//     // handle network errors
// }
//});



//MyApiEndpointInterface apiService = createApiService();
//Call<ResponseBody> call = apiService.getAppointment("5", "Office Visit", "900", "Test", "-", "2018-10-19", "09:00", "9", "10", "1");
//call.enqueue(new Callback<ResponseBody>() {
//    @Override
//    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//        if (response.isSuccessful()) {
//            // handle success response
//        } else {
//            // handle error response
//        }
//    }
//
//    @Override
//    public void onFailure(Call<ResponseBody> call, Throwable t) {
//        // handle failure
//    }




//	 Retrofit retrofit = new Retrofit.Builder()
//	            .baseUrl("")
//	            .addConverterFactory(GsonConverterFactory.create())
//	            .build();
//
//	    CreateAppointment appointmentService = retrofit.create(CreateAppointment.class);
//
//
//  PostAppointment appointmentRequest = new PostAppointment();
//  appointmentRequest.setCategoryId("2");
//  appointmentRequest.setTitle("Visit");
//  appointmentRequest.setDuration("80");
//  appointmentRequest.setHomeText("Test");
//  appointmentRequest.setAppointmentStatus("-");
//  appointmentRequest.setEventDate("2019-09-22");
//  appointmentRequest.setStartTime("09:00");
//  appointmentRequest.setFacility("9");
//  appointmentRequest.setBillingLocation("10");
//  appointmentRequest.setAppointmentId("2");
//  
//  
//  Call<AppointmentResponse> call = appointmentService.postAppointments(
//          "1",
//          "application/json",
//          "Bearer " + bearerToken,
//          appointmentRequest
//  );
//
//  call.enqueue(new Callback<AppointmentResponse>() {
//      @Override
//      public void onResponse(Call<AppointmentResponse> call, Response<AppointmentResponse> response) {
//          if (response.isSuccessful()) {
//         	 
//         	 AppointmentResponse appointmentResponse = response.body();
//         	 System.out.println(appointmentResponse);
//              // Handle the successful response, e.g., update UI or store data
//          } else {
//              // Handle the error response, e.g., display an error message
//         	 System.out.println("Request Not");
//         	    String errorBody;
//					try {
//						errorBody = response.errorBody().string();
//						System.out.println("Error response body: " + errorBody);
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//         	    
//          }
//      }
//
//      @Override
//      public void onFailure(Call<AppointmentResponse> call, Throwable t) {
//          // Handle the failure, e.g., log the error or display a message
//     	 System.out.println("No Network");
//      }
//  });
//}





//public void createRequestWithToken(String bearerToken) {
//	 
//	 Retrofit retrofit = new Retrofit.Builder()
//	            .baseUrl("")
//	            .addConverterFactory(GsonConverterFactory.create())
//	            .build();
//
//	    CreateAppointment appointmentService = retrofit.create(CreateAppointment.class);
//
//
// PostAppointment appointmentRequest = new PostAppointment();
// appointmentRequest.setCategoryId("2");
// appointmentRequest.setTitle("Visit");
// appointmentRequest.setDuration("80");
// appointmentRequest.setHomeText("Test");
// appointmentRequest.setAppointmentStatus("-");
// appointmentRequest.setEventDate("2019-09-22");
// appointmentRequest.setStartTime("09:00");
// appointmentRequest.setFacility("9");
// appointmentRequest.setBillingLocation("10");
// appointmentRequest.setAppointmentId("2");
// 
// 
// Call<AppointmentResponse> call = appointmentService.postAppointments(
//         "1",
//         "application/json",
//         "Bearer " + bearerToken,
//         appointmentRequest
// );
//
// call.enqueue(new Callback<AppointmentResponse>() {
//     @Override
//     public void onResponse(Call<AppointmentResponse> call, Response<AppointmentResponse> response) {
//         if (response.isSuccessful()) {
//        	 
//        	 AppointmentResponse appointmentResponse = response.body();
//        	 System.out.println(appointmentResponse);
//             // Handle the successful response, e.g., update UI or store data
//         } else {
//             // Handle the error response, e.g., display an error message
//        	 System.out.println("Request Not");
//        	    String errorBody;
//					try {
//						errorBody = response.errorBody().string();
//						System.out.println("Error response body: " + errorBody);
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//        	    
//         }
//     }
//
//     @Override
//     public void onFailure(Call<AppointmentResponse> call, Throwable t) {
//         // Handle the failure, e.g., log the error or display a message
//    	 System.out.println("No Network");
//     }
// });
//}










