package com.example.data.api

import com.example.data.common.Constants
import com.example.data.entities.DataCurrentWeather
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi{

    @GET(Constants.CURRENT_WEATHER_ENDPOINT)
    fun getCurrentWeather(
        @Query("q")cityName: String,
        @Query("APPID") appid: String): Single<DataCurrentWeather>

    @GET(Constants.FORECAST_ENDPOINT)
    fun getForecast(
        @Query("q")cityName: String,
        @Query("APPID")appid: String): Single<DataCurrentWeather>
}


