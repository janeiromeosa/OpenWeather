package com.example.presentation.currentweather

import android.provider.Contacts
import androidx.lifecycle.MutableLiveData
import com.example.data.common.Constants
import com.example.domain.common.Mapper
import com.example.domain.weather.CurrentWeatherUseCase
import com.example.domain.weather.DomainCurrentWeather
import com.example.presentation.common.BaseViewModel

class CurrentWeatherViewModel (private val currentWeatherUseCase: CurrentWeatherUseCase,
                               mapper: Mapper<DomainCurrentWeather, UICurrentWeather>): BaseViewModel(){

    private val loadingLiveData = MutableLiveData<Boolean>()
    private val contentLiveData = MutableLiveData<UICurrentWeather>()

    fun getWeatherInfo(){
        currentWeatherUseCase.execute()
            .map {mapper}
            .doOnSubscribe {loadingLiveData.value = true  }
            .doOnEvent()
    }



}