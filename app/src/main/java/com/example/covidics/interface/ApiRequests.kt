package com.example.covidics.`interface`

import com.example.covidics.api.CovidcsApi
import com.example.covidics.data.CivilDefenceData
import retrofit2.Call
import retrofit2.http.GET

interface ApiRequests {

    @GET(CovidcsApi.national_data)
    fun getNationalDataJson(): Call<List<CivilDefenceData>>

}