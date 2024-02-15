package com.example.lessonapp.viewmodel

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val time = MutableLiveData<String>()

    val fragMessage = MutableLiveData<String>()

    private val timer = object : CountDownTimer(20000, 1000) {
        override fun onTick(sec: Long) {
            time.postValue("${sec / 1000}")
        }

        override fun onFinish() {
            time.postValue("THE END livedata")
        }
    }

    init {
        timer.start()
    }

    fun startTimer() {
        timer.start()
    }

//    fun stopTimer() {
//        timer.cancel()
//    }

}