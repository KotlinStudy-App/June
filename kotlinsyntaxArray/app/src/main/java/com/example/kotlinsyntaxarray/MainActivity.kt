package com.example.kotlinsyntaxarray

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 배열

        var intArr:IntArray = IntArray(10)
        intArr[0] = 10

        var mothArray = CharArray(7)
        mothArray[0] = '월'


        var list = mutableListOf<Int>()
        list.add(4)


        Log.d("컬렉션","0번인덱스${list.get(0)}")
        var mutableMap = mutableMapOf<String, String>()
        mutableMap.put("변수1","값1")
        mutableMap.put("변수2","값2")
        Log.d("mutable","0번인덱스${mutableMap.get("변수1")}")

    }
}