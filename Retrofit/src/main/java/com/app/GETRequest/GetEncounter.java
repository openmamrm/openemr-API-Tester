package com.app.GETRequest;

import java.util.List;

import com.app.Response.EncounterResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface GetEncounter {
	@GET("/apis/default/api/patient/{puuid}/encounter")
	Call <List<EncounterResponse>>
	getEncounterCall(@Path("puuid") String puuid, @Header("accept") String acceptHeader,
            @Header("Authorization") String authorizationHeader);


}
