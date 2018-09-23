package io.navendra.sunrise.models

import io.navendra.sunrise.models.mvrxState.WeatherState
import java.util.*

object WeatherDataFactory{

    //region Random data Generators

    val random = Random()

    fun getRandomInt() : Int{
       return random.nextInt(100)
    }

    fun getRandomDouble() : Double{
        return random.nextDouble()
    }

    fun getRandomDate() : Date{
        return Date()
    }

    fun getRandomWeather() : WeatherState{
        return WeatherState(getRandomInt(), getRandomInt(), getRandomDate(), getRandomDouble(),
                getRandomDouble(), getRandomDouble(), getRandomDouble(), getRandomDouble(), getRandomDouble())
    }

    fun getRandomWeatherList(count:Int) : List<WeatherState>{
        val weatherList = mutableListOf<WeatherState>()
        repeat(count){
            weatherList.add(getRandomWeather())
        }
        return weatherList
    }


    //endregion

}