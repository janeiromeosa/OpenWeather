package com.example.domain.weather

import com.example.domain.common.SingleUseCase
import com.example.domain.common.ThreadScheduler
import io.reactivex.Single

class CurrentWeatherUseCase(
    threadScheduler: ThreadScheduler,
    val weatherRepository: WeatherRepository
) : SingleUseCase<String, DomainCurrentWeather>(threadScheduler) {

    override fun create(params: String): Single<DomainCurrentWeather> =
        weatherRepository.getCurrentWeather(params, params)

}