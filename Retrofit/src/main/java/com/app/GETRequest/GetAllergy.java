package com.app.GETRequest;




import com.app.Response.ResponseAllergy;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface GetAllergy {
	@GET("/apis/default/api/patient/{puuid}/allergy")
	
	Call <ResponseAllergy>
	getAllergiesCall(@Path("puuid") String puuid,@Header("accept") String acceptHeader,@Header("Authorization") String authorizationHeader);
}
