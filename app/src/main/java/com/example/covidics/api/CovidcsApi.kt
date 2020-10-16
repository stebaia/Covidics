package com.example.covidics.api

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CovidcsApi {

    public companion object {
        const val base_url = "https://raw.githubusercontent.com/"
        const val national_data = "/pcm-dpc/COVID-19/master/dati-json/dpc-covid19-ita-andamento-nazionale.json"


    }



}