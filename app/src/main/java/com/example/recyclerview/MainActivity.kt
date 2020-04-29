package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private val items = mutableListOf<ItemModel>()
    private lateinit var adapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init(){
        adapter = RecyclerViewAdapter(items)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        Handler().postDelayed({
            setData()
            adapter.notifyDataSetChanged()
        }, 3000)
    }

    private fun setData(){
        items.add(ItemModel(R.mipmap.first, "First Title", "First Description", "Author : Bacho"))
        items.add(ItemModel(R.mipmap.second, "Second Title", "Second Description", "Author : Bacho"))
        items.add(ItemModel(R.mipmap.third, "Third Title", "Third Description", "Author : Bacho"))
        items.add(ItemModel(R.mipmap.fourth, "Fourth Title", "Fourth Description", "Author : Bacho"))
        items.add(ItemModel(R.mipmap.fifth, "Fifth Title", "Fifth Description", "Author : Bacho"))
    }

}
