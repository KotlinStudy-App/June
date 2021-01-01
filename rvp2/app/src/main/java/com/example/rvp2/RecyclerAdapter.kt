package com.example.rvp2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class RecyclerAdapter(val dataList: ArrayList<DataList>) : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.detail_recycler, parent,false))
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.img.setImageResource(dataList.get(position).img)
        holder.name.text = dataList.get(position).name
    }


    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        val img = itemView.findViewById<ImageView>(R.id.user_img)
        val name = itemView.findViewById<TextView>(R.id.user_text)
    }

}