package com.example.kotlinsyntaxfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        functionName()

    }
    fun functionName(){

    }

    fun functionParam(param1:String){

    }

    fun getPI () : Double{
        return 3.141592
    }
}