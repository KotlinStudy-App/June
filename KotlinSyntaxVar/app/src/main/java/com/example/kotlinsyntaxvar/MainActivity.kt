package com.example.kotlinsyntaxvar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var variable = "홍길동"

        var variable2:String
        variable2 = "안녕하세요"
        //실수형
        var doubleValue:Double = 35.8
        var floatValue:Float = 123.7F

        var intValue:Int = 123456
        var longValue:Long = 2_147_483_687
        var shortValue:Short = 123
        var byteValue:Byte = 127

        var charValue:Char = 'a'
        
    }


}