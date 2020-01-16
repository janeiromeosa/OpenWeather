package com.example.presentation.currentweather

import android.provider.Contacts
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.data.common.Constants
import com.example.domain.common.Mapper
import com.example.domain.weather.CurrentWeatherUseCase
import com.example.domain.weather.DomainCurrentWeather
import com.example.presentation.common.BaseViewModel
import com.example.presentation.common.extentions.addTo
import com.example.presentation.di.mappers

class CurrentWeatherViewModel (private val currentWeatherUseCase: CurrentWeatherUseCase,
                               private val mapper: Mapper<DomainCurrentWeather, UICurrentWeather>): BaseViewModel(){

    private val loadingLiveData = MutableLiveData<Boolean>()
    private val contentLiveData = MutableLiveData<UICurrentWeather>()

    fun getWeatherInfo(){
        currentWeatherUseCase.execute()
            .map { mapper.map(it)}
            .doOnSubscribe {loadingLiveData.value = true  }
            .subscribe()
            .addTo(compositeDisposable)
    }

    fun getLoadingObservable(): LiveData<Boolean> = loadingLiveData
    fun getContentObservable(): LiveData<UICurrentWeather> = contentLiveData



}