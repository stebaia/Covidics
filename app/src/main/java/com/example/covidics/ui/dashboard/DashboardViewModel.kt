package com.example.covidics.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

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