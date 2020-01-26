package com.example.presentation.currentweather

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.domain.common.Mapper
import com.example.domain.weather.CurrentWeatherUseCase
import com.example.domain.weather.DomainCurrentWeather
import com.example.presentation.common.BaseViewModel
import com.example.presentation.common.extentions.addTo

class CurrentWeatherViewModel(
    private val currentWeatherUseCase: CurrentWeatherUseCase,
    private val mapper: Mapper<DomainCurrentWeather, UICurrentWeather>
) : BaseViewModel() {

    private val loadingLiveData = MutableLiveData<Boolean>()
    private val contentLiveData = MutableLiveData<UICurrentWeather>()
    private val errorLiveData = MutableLiveData<String>()

    fun getWeatherInfo() {
        currentWeatherUseCase.execute()
            .map { mapper.map(it) }
            .doOnSubscribe { loadingLiveData.value = true }
            .doOnEvent { _, _ -> loadingLiveData.value = false }
            .subscribe(
//                {if (it.payload?.isEmpty() == true){
                { contentLiveData.value = it },
                { errorLiveData.value = it.localizedMessage})
        .addTo(compositeDisposable)
    }

    fun getLoadingObservable(): LiveData<Boolean> = loadingLiveData
    fun getContentObservable(): LiveData<UICurrentWeather> = contentLiveData
    fun getErrorObserable(): LiveData<String> = errorLiveData


}