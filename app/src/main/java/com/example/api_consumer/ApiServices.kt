package com.example.api_consumer

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiServices {
    @GET
   suspend fun getDocsByBreeds(@Url url: String): Response<dogResponse>
}