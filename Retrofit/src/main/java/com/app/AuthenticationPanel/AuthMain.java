package com.app.AuthenticationPanel;
//import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.app.Secrets.Secrets;

import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Call;
import retrofit2.Retrofit;
//import okhttp3.Credentials;
//import okhttp3.Interceptor;
//import okhttp3.OkHttpClient;
//import okhttp3.Request;


public class AuthMain {
	public void getBearer(AuthCallback callback) {
		
	
	 String username = "test";
	 String password = "123456789";
//	 

	 Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(Secrets.BaseURL)
                .addConverterFactory(GsonConverterFactory.create())
                
                ;

	 Retrofit retrofit = builder.build();
    PostAuthInterface postAuthInterface = retrofit.create(PostAuthInterface.class);
    
    Map<String, Object> map= new HashMap<>();
    map.put("grant_type");
    map.put("client_id");
    map.put("scope");
    map.put("user_role");
    map.put("username", username);
    map.put("password", password );
    
    Call<AuthResponse> call = postAuthInterface.authenticateUser(map);
    call.enqueue(new Callback<AuthResponse>() {
        @Override
        public void onResponse(Call<AuthResponse> call, Response<AuthResponse> response) {
            if (response.isSuccessful()) {
                AuthResponse authResponse = response.body();
                if (authResponse != null) {
                    String tokenresponse = authResponse.getAccessToken();
                    callback.onTokenReceived(tokenresponse);
                    
                } else {
                    // Handle the case when authResponse is null
                	System.out.println("Auth Response is Null");
                }
            } else {
                // Handle the case when response is not successful
            	System.out.println("1.Auth Response is Not Successfull");
            }
        }

        @Override
        public void onFailure(Call<AuthResponse> call, Throwable t) {
            // Network Fault
        	System.out.println("No Network"); 
        }
    });
    }
}
