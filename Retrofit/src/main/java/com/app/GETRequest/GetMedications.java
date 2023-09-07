package com.app.GETRequest;


import java.util.List;

import com.app.Response.ResponseMedication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface GetMedications {
	@GET("/apis/default/api/patient/{pid}/medication")
	Call <List<ResponseMedication>>
	getMedications(@Path("pid") String pid, @Header("accept") String acceptHeader,
            @Header("Authorization") String authorizationHeader);


}
