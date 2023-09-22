package com.app.FinalEndpointsFunctions;

import java.util.HashMap;
import java.util.Map;

import com.app.AuthenticationPanel.AuthCallback;
import com.app.AuthenticationPanel.AuthResponse;
import com.app.AuthenticationPanel.PostAuthInterface;

import com.app.Secrets.Secrets;

import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Call;
import retrofit2.Retrofit;




public class RefreshToBearerGenerator implements AuthCallback{
	private AuthCallback callback;

    public RefreshToBearerGenerator(AuthCallback callback) {
        this.callback = callback;
    }
	public void genBearerRefreshToken(String refreshToken) {
	
		
		
	 Retrofit.Builder builder = new Retrofit.Builder()
               .baseUrl(Secrets.BaseURL)
               .addConverterFactory(GsonConverterFactory.create())
               ;

	 Retrofit retrofit = builder.build();
   PostAuthInterface postAuthInterface = retrofit.create(PostAuthInterface.class);
   
   Map<String, Object> map= new HashMap<>();
   map.put("grant_type", "refresh_token");
   map.put("client_id", Secrets.CLIENT_ID);
   map.put("refresh_token", refreshToken);
   
   
   Call<AuthResponse> call = postAuthInterface.authenticateUser(map);
   call.enqueue(new Callback<AuthResponse>() {
       @Override
       public void onResponse(Call<AuthResponse> call, Response<AuthResponse> response) {
           if (response.isSuccessful()) {
               AuthResponse authResponse = response.body();
               if (authResponse != null) {
                   String tokenresponse = authResponse.getAccessToken();
                   System.out.println(tokenresponse);
                   callback.onNewBearer(tokenresponse);
                   
               } else {
                   // Handle the case when authResponse is null
               	System.out.println("Auth Response is Null");
               }
           } else {
               // Handle the case when response is not successful
           	System.out.println("2.Auth Response is Not Successfull");
           }
       }

       @Override
       public void onFailure(Call<AuthResponse> call, Throwable t) {
           // Network Fault
       	System.out.println("No Network"); 
       }
   });
 }	
	 @Override
	    public void onTokenReceived(String token) {
	        // Not used in this class
	    }

	    @Override
	    public void onError(Throwable t) {
	        // Not used in this class
	    }

	    @Override
	    public void onNewBearer(String bearerToken) {
	        // Not used in this class
	    }
}


