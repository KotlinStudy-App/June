package com.example.sqlite

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_recycler.view.*
import java.text.SimpleDateFormat

class RecyclerAdapter : RecyclerView.Adapter<Holder>() {
    //이거 사용 메모는 그냥 어디서든 쓸수있는건가
    val listData = mutableListOf<Memo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent,false)

        return Holder(view)
    }


    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val memo = listData.get(position)
        holder.setMemo(memo)
    }
}

class Holder(itemView : View) : RecyclerView.ViewHolder(itemView){
    fun setMemo(memo: Memo){
        itemView.textNo.text = "${memo.no}"
        itemView.textContent.text = "${memo.content}"
        val sdf = SimpleDateFormat("yyyy/MM/dd hh:mm")
        val datetime = sdf.format(memo.datetime)
        itemView.textDatetime.text = "$datetime"
    }

}