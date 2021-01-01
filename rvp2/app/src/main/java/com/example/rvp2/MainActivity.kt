package com.example.rvp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataList = arrayListOf(
                DataList(R.mipmap.ic_launcher,"안녕"),
                DataList(R.mipmap.ic_launcher,"안녕"),
                DataList(R.mipmap.ic_launcher,"안녕"),
                DataList(R.mipmap.ic_launcher,"안녕"),
                DataList(R.mipmap.ic_launcher,"안녕")
        )

        recyler_id.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyler_id.setHasFixedSize(true)

        recyler_id.adapter = RecyclerAdapter(dataList)


    }
}