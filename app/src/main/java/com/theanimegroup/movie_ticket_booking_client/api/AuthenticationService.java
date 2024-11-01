package com.theanimegroup.movie_ticket_booking_client.api;

import com.theanimegroup.movie_ticket_booking_client.models.request.AuthenticationRequest;
import com.theanimegroup.movie_ticket_booking_client.models.request.RegisterRequest;
import com.theanimegroup.movie_ticket_booking_client.models.response.AccountResponseBasic;
import com.theanimegroup.movie_ticket_booking_client.models.response.AuthenticationResponse;
import com.theanimegroup.movie_ticket_booking_client.models.response.ResponseObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface AuthenticationService {
    @POST("/api/auth/login")
    Call<ResponseObject<AuthenticationResponse>> login(@Body AuthenticationRequest loginRequest);

    @POST("/api/auth/register")
    Call<ResponseObject<Object>> register(@Body RegisterRequest registerRequest);

    @GET("/api/auth/who-am-i")
    Call<ResponseObject<AccountResponseBasic>> me(@Header("Authorization") String header);
}
