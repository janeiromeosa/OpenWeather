package com.example.data.api

import retrofit2.http.GET
import retrofit2.http.Path

interface weatherApi

    @GET("")
    fun getCurrentWeather(@Path())