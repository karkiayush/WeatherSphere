package com.example.weathersphere

import android.graphics.Typeface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    /*https://api.openweathermap.org/data/2.5/weather?q=kathmandu&appid=c9454baee04c4abfa42bf5331bd37b17*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}