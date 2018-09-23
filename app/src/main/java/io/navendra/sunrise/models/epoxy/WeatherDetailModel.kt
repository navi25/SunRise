package io.navendra.sunrise.models.epoxy

import android.support.annotation.DrawableRes
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import io.navendra.sunrise.R
import kotlinx.android.synthetic.main.fragment_weather_details.view.*

    @EpoxyModelClass(layout = R.layout.fragment_weather_details)
    abstract class WeatherDetailModel : EpoxyModelWithHolder<WeatherDetailModel.ViewHolder>(){

        //region EpoxyAttributes

        @EpoxyAttribute
        var date:String = ""

        @EpoxyAttribute
        @DrawableRes
        var conditionImage:Int = 0

        @EpoxyAttribute
        var condition:String =""

        @EpoxyAttribute
        var low:String = ""

        @EpoxyAttribute
        var high:String = ""

        @EpoxyAttribute
        var humidity:String = ""

        @EpoxyAttribute
        var pressure:String=""

        @EpoxyAttribute
        var wind:String =""

        //endregions

        override fun bind(holder: ViewHolder?) {
            holder!!.date.text = date
    //        holder.conditionImage.setImageResource(conditionImage)
    //        holder.condition.text = condition
            holder.low.text = low
            holder.high.text = high

            holder.humidity.text = humidity
            holder.pressure.text = pressure
            holder.wind.text = wind
        }



        inner class ViewHolder :EpoxyHolder(){

            //region Fragment Weather Details Variables
            lateinit var date : TextView
            lateinit var conditionImage : ImageView
            lateinit var condition : TextView
            lateinit var low : TextView
            lateinit var high : TextView
            lateinit var humidity : TextView
            lateinit var pressure : TextView
            lateinit var wind : TextView
            //endregion

            override fun bindView(itemView: View?) {
                date = itemView!!.date
                conditionImage = itemView.imageView
                condition = itemView.condition
                low = itemView.low
                high = itemView.high

                humidity = itemView.hValue
                pressure = itemView.pValue
                wind = itemView.wValue

            }

        }
    }