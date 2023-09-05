package com.app.POSTRequest;

import com.app.Response.EncounterResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;




public  interface  PostEncounter {
	@POST("/apis/default/api/patient/{puuid}/encounter")
	Call <EncounterResponse>
	postEncounter(@Path("puuid") String puuid, @Header("accept") String acceptHeader,@Header("Content-Type") String contentType,
            @Header("Authorization") String authorizationHeader, @Body EncounterResponse encounter);
}
