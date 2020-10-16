package com.example.covidics.`interface`

import com.example.covidics.api.CovidcsApi
import com.example.covidics.data.CivilDefenceData
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiRequests {

    @GET(CovidcsApi.national_data)
    fun getNationalDataJson(): Call<List<CivilDefenceData>>

    companion object {
        operator fun invoke(): ApiRequests {
            val requestInterceptor = Interceptor { chain ->
                val url = chain.request()
                    .url()
                    .newBuilder()
                    .build()
                val request = chain.request()
                    .newBuilder()
                    .url(url)
                    .build()
                return@Interceptor chain.proceed(request)
            }

            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(requestInterceptor)
                .build()

            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(CovidcsApi.base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiRequests::class.java)

        }
    }

}