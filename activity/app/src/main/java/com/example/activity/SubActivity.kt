package com.example.activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        btnReturn.setOnClickListener {
            val intent = Intent()
            intent.putExtra("return","다시 돌려드림")
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }
}