package com.app.POSTRequest;


import com.app.Response.ResponseMedication;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface PostMedication {
	@POST("/apis/default/api/patient/{pid}/medication")
	Call <ResponseMedication>
	postMedications(@Path("pid") String pid, @Header("accept") String acceptHeader,
            @Header("Authorization") String authorizationHeader, @Body ResponseMedication postmeds);
}