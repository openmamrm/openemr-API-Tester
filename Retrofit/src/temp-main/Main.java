package main_app;

import POST_Req.MyApiService;
import Request_Body.Registration;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        String baseUrl = "";

// Create a Retrofit instance
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Registration request = new Registration();// Create an instance of the Retrofit service interface
        MyApiService apiService = retrofit.create(MyApiService.class);
        request.setApplication_type("private");
        request.setClient_name("Main App");
        request.setToken_endpoint_auth_method("client_secret_post");
        request.setUname("");
        request.setPword("");
        request.setScope("openid offline_access api:oemr api:fhir api:port user/allergy.read user/allergy.write user/appointment.read user/appointment.write user/dental_issue.read user/dental_issue.write user/document.read user/document.write user/drug.read user/encounter.read user/encounter.write user/facility.read user/facility.write user/immunization.read user/insurance.read user/insurance.write user/insurance_company.read user/insurance_company.write user/insurance_type.read user/list.read user/medical_problem.read user/medical_problem.write user/medication.read user/medication.write user/message.write user/patient.read user/patient.write user/practitioner.read user/practitioner.write user/prescription.read user/procedure.read user/soap_note.read user/soap_note.write user/surgery.read user/surgery.write user/transaction.read user/transaction.write user/vital.read user/vital.write user/AllergyIntolerance.read user/CareTeam.read user/Condition.read user/Coverage.read user/Encounter.read user/Immunization.read user/Location.read user/Medication.read user/MedicationRequest.read user/Observation.read user/Organization.read user/Organization.write user/Patient.read user/Patient.write user/Practitioner.read user/Practitioner.write user/PractitionerRole.read user/Procedure.read patient/encounter.read patient/patient.read patient/AllergyIntolerance.read patient/CareTeam.read patient/Condition.read patient/Coverage.read patient/Encounter.read patient/Immunization.read patient/MedicationRequest.read patient/Observation.read patient/Patient.read patient/Procedure.read"); // continue with the rest of the scope values

// For lists, use Arrays.asList() to create and set the list values
        request.setRedirect_uris(List.of("/callback"));
        request.setPost_logout_redirect_uris(List.of("/logout/callback"));

// Execute the POST request
        Call<ResponseBody> call = apiService.postRequest("application/json", request);
        try {
            retrofit2.Response<ResponseBody> response = call.execute();
            if (response.isSuccessful()) {
                // Request was successful, handle the response
                String responseBody = response.body().string();
                System.out.println("Response: " + responseBody);
            } else {
                // Handle error
                System.out.println("Request failed: " + response.code() + " - " + response.message());
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
