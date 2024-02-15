package com.example.lessonapp

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MyActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_my2)

        val tvText = findViewById<TextView>(R.id.tv_title)

        tvText.text = "GGGGGGGGG"
    }
}