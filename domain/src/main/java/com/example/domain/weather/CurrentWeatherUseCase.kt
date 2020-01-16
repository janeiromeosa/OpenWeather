package com.example.domain.weather

import com.example.domain.common.DomainConstants
import com.example.domain.common.SingleNoParamsUseCase
import com.example.domain.common.ThreadScheduler
import io.reactivex.Single

class CurrentWeatherUseCase(threadScheduler: ThreadScheduler,
                            private val weatherRepository: WeatherRepository)
    : SingleNoParamsUseCase<DomainCurrentWeather>(threadScheduler) {

    override fun create(): Single<DomainCurrentWeather> =
        weatherRepository.getCurrentWeather(DomainConstants.LONDON, DomainConstants.API_KEY)


}