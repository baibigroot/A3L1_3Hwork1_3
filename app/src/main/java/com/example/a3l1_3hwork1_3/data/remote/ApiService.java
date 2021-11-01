package com.example.a3l1_3hwork1_3.data.remote;
import com.example.a3l1_3hwork1_3.data.models.MainResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("api/character")
    Call<MainResponse> fetchCharacters();


}

