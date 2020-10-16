package com.example.covidics.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.example.covidics.MainActivity
import com.example.covidics.R
import com.example.covidics.`interface`.ApiRequests
import com.example.covidics.api.CovidcsApi
import com.example.covidics.ui.dashboard.DashboardViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.awaitResponse
import retrofit2.converter.gson.GsonConverterFactory

class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        getinitData()
    }


    private fun getinitData(){
        intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
    }

}