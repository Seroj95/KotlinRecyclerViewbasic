package com.example.myrecyclerviewkotlin

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
lateinit var adapter: KotRecyclerViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list= listOf(
                KotReciclerItem(R.drawable.ic_android_black_24dp,"poxos","Poxosyan"),
                KotReciclerItem(R.drawable.ic_android_black_24dp,"poxos","Poxosyan"),
                KotReciclerItem(R.drawable.ic_android_black_24dp,"poxos","Poxosyan")
        )
        adapter=KotRecyclerViewAdapter(list as MutableList<KotReciclerItem>)
val layoutManager=LinearLayoutManager(this)
       recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=layoutManager
        recyclerView.adapter=adapter
    }
}
