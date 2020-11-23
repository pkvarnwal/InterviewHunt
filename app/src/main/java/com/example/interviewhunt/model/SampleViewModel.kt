package com.example.interviewhunt.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SampleViewModel : ViewModel() {

    var i: Int = 0
    private val data: MutableLiveData<Int> = MutableLiveData<Int>()

    fun add() {
        data.postValue(i++)
    }

    fun reduce() {
        data.postValue(i--)
    }

    fun getValue(): LiveData<Int> {
        return data
    }
}