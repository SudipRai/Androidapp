
package com.sudip.mykotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView

class ListviewActivity2 : AppCompatActivity() {
    private lateinit var listview: ListView
    private val countries= arrayOf(
        "Nepal","Kathmandu",
        "India","New Delhi",
        "China","Beijing")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview2)
        listview=findViewById(R.id.listview)
        val countryCapitalMap= mutableMapOf<String, String>()
        for(i in countries.indices step 2){
            countryCapitalMap[countries[i]]=countries[i+1]
        }
        val adapter= ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                countryCapitalMap.keys.toTypedArray()
        )

        listview.adapter=adapter

        listview.setOnItemClickListener { parent, view, position, id ->
            val country = parent.getItemAtPosition(position).toString()
            val capital = countryCapitalMap[country]!!.toString()
            val intent = Intent(this,CapitalActivity::class.java)
            intent.putExtra("country",country)
            intent.putExtra("capital",capital)
            startActivity(intent)

        }
    }
}