package com.sudip.mykotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListviewActivity : AppCompatActivity() {
    private lateinit var listview: ListView
    private val countries= arrayOf("Nepal","India","China")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        listview=findViewById(R.id.listview)
        val adapter=ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            countries
        )
        listview.adapter=adapter
        listview.setOnItemClickListener{
            parent,view,position,id ->
            val element=parent.getItemAtPosition(position).toString()
            Toast.makeText(this, element, Toast.LENGTH_SHORT).show()
        }

    }
}