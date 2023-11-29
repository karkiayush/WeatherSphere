package com.example.weathersphere

import android.os.Bundle
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.create


class MainActivity : AppCompatActivity() {

    /*https://api.openweathermap.org/data/2.5/weather?q=kathmandu&appid=c9454baee04c4abfa42bf5331bd37b17*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getWeatherData()
    }

    private fun getWeatherData() {
        val inputFieldRef = findViewById<SearchView>(R.id.searchView)
        val inputCity = inputFieldRef.
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://api.openweathermap.org/data/2.5/weather?")
            .build()
            .create(ApiInterface::class.java)

        val response =
            retrofit.getWeatherData("Kathmandu", "c9454baee04c4abfa42bf5331bd37b17", "metric")
        response.enqueue(object : Callback<WeatherApp>{
            override fun onResponse(call: Call<WeatherApp>, response: Response<WeatherApp>) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<WeatherApp>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}