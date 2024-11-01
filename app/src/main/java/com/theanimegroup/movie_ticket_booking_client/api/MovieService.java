package com.theanimegroup.movie_ticket_booking_client.api;

import com.theanimegroup.movie_ticket_booking_client.models.entity.Movie;
import com.theanimegroup.movie_ticket_booking_client.models.response.ResponseObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MovieService {
    @GET("/api/Movie")
    Call<ResponseObject<List<Movie>>> getAllMovies();

    @GET("api/Movie/{id}")
    Call<ResponseObject<Movie>> getMovieDetails(@Path("id") int movieId);


}


