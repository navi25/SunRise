package io.navendra.sunrise.ui.views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import io.navendra.sunrise.R
import io.navendra.sunrise.viewmodels.epoxy.WeatherDetailController

class MainActivity : AppCompatActivity() {

    private val controller by lazy {WeatherDetailController()}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_weather_details)
        controller.requestModelBuild()
    }


}
