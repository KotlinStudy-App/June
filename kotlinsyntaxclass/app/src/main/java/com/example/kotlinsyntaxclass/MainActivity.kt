package com.example.kotlinsyntaxclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cls = ClassA()
        Log.d("check", "${cls.variable}안녕")


    }
}

open class ClassA {

    init{
        //클래스를 초기화하면 호출한다
    }

    open var variable:String = "" // 프로퍼티

    fun function(){
        var variable_local = ""
    }
}

class ClassB : ClassA(){
    override var variable = "이준회"
}