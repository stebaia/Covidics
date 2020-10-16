package com.example.covidics.ui.dashboard

import android.content.Intent
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.example.covidics.MainActivity
import com.example.covidics.`interface`.ApiRequests
import com.example.covidics.api.CovidcsApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.awaitResponse
import retrofit2.converter.gson.GsonConverterFactory

class DashboardViewModel : ViewModel() {

    fun fetchNationalDate(){
        val api = Retrofit.Builder()
            .baseUrl(CovidcsApi.base_url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiRequests::class.java)

        GlobalScope.launch(Dispatchers.IO){
            val response = api.getNationalDataJson().awaitResponse()
            if (response.isSuccessful){
                val data = response.body()!!
                Log.d("response_retrofit",   data[data.lastIndex].nuovi_positivi.toString())

            }
        }
    }

    private var stringMutableLiveData: MutableLiveData<String>? = null

    /*private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text*/

    fun init() {
        stringMutableLiveData = MutableLiveData<String>()
    }

    fun sendData(msg: String?) {
        stringMutableLiveData?.postValue(msg)
    }

    fun getPositiveCases(): LiveData<String?>? {
        return stringMutableLiveData
    }


}