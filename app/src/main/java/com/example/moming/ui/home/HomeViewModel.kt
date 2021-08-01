package com.example.moming.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "작심삼일이라도 하자!"
    }
    val text: LiveData<String> = _text

    fun onStartButtonClick(){

    }
}