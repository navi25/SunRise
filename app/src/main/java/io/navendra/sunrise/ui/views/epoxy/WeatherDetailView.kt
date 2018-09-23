package io.navendra.sunrise.ui.views.epoxy

import android.content.Context
import android.util.AttributeSet
import android.widget.GridView
import android.widget.TextView
import com.airbnb.epoxy.ModelView
import com.airbnb.epoxy.TextProp
import io.navendra.sunrise.utils.SunriseConstant

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class WeatherDetailView @JvmOverloads constructor (context: Context,
             attributeSet: AttributeSet?=null,
             defStyleAttr:Int = 0,
             defStyleRes:Int = 0 )
    : GridView(context,attributeSet,defStyleAttr,defStyleRes){


    private var humidity : TextView = TextView(context,attributeSet,defStyleAttr,defStyleRes)
    private var pressure : TextView = TextView(context,attributeSet,defStyleAttr,defStyleRes)
    private var wind : TextView = TextView(context,attributeSet,defStyleAttr,defStyleRes)

    @TextProp var humidityValue : TextView = TextView(context,attributeSet,defStyleAttr,defStyleRes)
    @TextProp var pressureValue : TextView = TextView(context,attributeSet,defStyleAttr,defStyleRes)
    @TextProp var windValue : TextView = TextView(context,attributeSet,defStyleAttr,defStyleRes)

    init {
        humidity.text = SunriseConstant.HUMIDITY
        pressure.text = SunriseConstant.PRESSURE
        wind.text = SunriseConstant.WIND
    }

}