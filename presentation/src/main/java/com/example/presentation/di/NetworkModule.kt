package com.example.presentation.di

import com.example.data.api.WeatherApi
import com.example.domain.common.ThreadScheduler
import com.example.presentation.common.extentions.RxScheduler
import com.google.gson.Gson
import io.reactivex.Scheduler
import okhttp3.OkHttpClient
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

private const val ENDPOINT = "https://samples.openweathermap.org/"

val networkModules = module {

    single(name = RETROFIT_INSTANCE) { createNetworkClient(ENDPOINT) }
    single {(get(RETROFIT_INSTANCE) as Retrofit).create(WeatherApi::class.java) }
    single{ Gson() }
    single<ThreadScheduler>{ RxScheduler() }
}

fun createNetworkClient(baseUrl: String) =
    retrofitClient(baseUrl, httpClient())

private fun httpClient(): OkHttpClient {
    val clientBuilder = OkHttpClient.Builder()
    clientBuilder.readTimeout(120, TimeUnit.SECONDS)
    clientBuilder.writeTimeout(120, TimeUnit.SECONDS)
    return clientBuilder.build()
}

fun retrofitClient(baseUrl: String, httpClient: OkHttpClient): Retrofit =
    Retrofit.Builder()
        .baseUrl(baseUrl)
        .client(httpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
