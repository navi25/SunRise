package io.navendra.sunrise.state

import com.airbnb.mvrx.MvRxState
import java.util.*

data class WeatherState(
        val id:Int,
        val iconId : Int,
        val date : Date,
        val min: Double,
        val max: Double,
        val humidity: Double,
        val pressure : Double,
        val wind: Double,
        val degrees : Double
) : MvRxState