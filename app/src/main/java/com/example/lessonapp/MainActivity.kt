package com.example.lessonapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.lessonapp.viewmodel.MainViewModel


class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Инициализация верстки и классов

        val tvTimer = findViewById<TextView>(R.id.tv_timer)
        val btnTimer = findViewById<Button>(R.id.btn_start)

//        tvTimer.text = "Привет тестовое лессон"
//
//        viewModel.time.observe(this) { sec ->
//            tvTimer.text = sec
//        }

        startActivity(Intent(this, FragActivity::class.java))

    }

    override fun onStart() {
        super.onStart()

    }

    override fun onResume() {
        super.onResume()

        //основное место действия
        // пользователь уже работает
    }

    override fun onPause() {
        super.onPause()

        //Приложение свернуто
    }

    override fun onStop() {
        super.onStop()

    }

    override fun onDestroy() {
        super.onDestroy()
    }

}