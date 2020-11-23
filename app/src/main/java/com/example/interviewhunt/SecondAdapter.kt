package com.example.interviewhunt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SecondAdapter(val list : ArrayList<String>) : RecyclerView.Adapter<SecondAdapter.MyViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val item = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(item)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindData(list, position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MyViewHolder(v : View) : RecyclerView.ViewHolder(v) {
       val textView : TextView = v.findViewById(R.id.text_view)

        fun bindData(list: ArrayList<String>, position: Int) {
        textView.setText(list[position])
        }
    }
}