package com.example.kotlinsyntaxfor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intArray = intArrayOf(0,1,2);

        for(value in intArray){
            Log.d("intArray","${value}")
        }


        for(index in 10 downTo 1 step 2){
            Log.d("for", "${index}")
        }


    }
}