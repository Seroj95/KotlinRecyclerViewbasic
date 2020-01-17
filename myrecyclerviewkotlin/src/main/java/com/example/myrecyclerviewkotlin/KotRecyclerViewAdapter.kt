package com.example.myrecyclerviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KotRecyclerViewAdapter (val arrayList:MutableList<KotReciclerItem>): RecyclerView.Adapter<KotRecyclerViewAdapter.KotRecyclerView>() {
inner class KotRecyclerView(itemView: View) : RecyclerView.ViewHolder(itemView){
val imageView=itemView?.findViewById<ImageView>(R.id.imageView)
    val textView1=itemView.findViewById<TextView>(R.id.text1)
    val textView2=itemView.findViewById<TextView>(R.id.text2)
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KotRecyclerView {
       val view=LayoutInflater.from(parent.context).inflate(R.layout.kotrecycler_view_item,parent,false)
        return  KotRecyclerView(view)
    }

    override fun getItemCount(): Int {
        return  arrayList.size
    }

    override fun onBindViewHolder(holder: KotRecyclerView, position: Int) {
        val recyclerViewItem = arrayList[position]
holder.imageView.setImageResource(recyclerViewItem.imageView)
        holder.textView1.text=recyclerViewItem.text1
        holder.textView2.text=recyclerViewItem.text2
    }

}