package io.navendra.sunrise.viewmodels.epoxy

import com.airbnb.epoxy.EpoxyController
import io.navendra.sunrise.models.WeatherDataFactory
import io.navendra.sunrise.models.epoxy.WeatherDetailModel_
import io.navendra.sunrise.models.mvrxState.WeatherState

    class WeatherDetailController : EpoxyController(){

        var weather : WeatherState = WeatherDataFactory.getRandomWeather()

        override fun buildModels() {
            WeatherDetailModel_()
                    .id(1L)
                    .date(weather.date.toString())
                    .low(weather.min.toString())
                    .high(weather.max.toString())
                    .humidity(weather.humidity.toString())
                    .pressure(weather.pressure.toString())
                    .wind(weather.wind.toString())
                    .addTo(this)


        }

    }