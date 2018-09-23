package io.navendra.sunrise.ui.views

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import io.navendra.sunrise.R

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE)
        setContentView(R.layout.activity_main)
        window.setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.titlebar)
    }
}
