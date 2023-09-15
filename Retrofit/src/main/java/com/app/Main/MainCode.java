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

