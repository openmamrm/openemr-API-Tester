package com.app.POSTRequest;


import com.app.Response.ResponseAllergy;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface PostAllergy {
	@POST("/apis/default/api/patient/{puuid}/allergy")
	Call <ResponseAllergy>
	postAllergyCall(@Path("puuid") String puuid, @Header("accept") String acceptHeader,
			@Header("Authorization") String authorizationHeader, @Body ResponseAllergy allergybody);
}
