package com.example.kotlinsyntaxcondition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var month = 6
        when(month){
            6 -> Log.d("when","6월입니다")
        }
    }
}