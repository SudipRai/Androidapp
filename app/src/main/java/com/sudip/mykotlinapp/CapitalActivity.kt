package com.sudip.mykotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CapitalActivity : AppCompatActivity() {
    private lateinit var txtcapital:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capital)
        txtcapital=findViewById(R.id.txtcapital)
        val intent = intent
        if(intent!=null){
            val country = intent.getStringExtra("country")
            val capital = intent.getStringExtra("capital")
            txtcapital.text = "$country's capital is : $capital"
        }else{
            txtcapital.text = "No values received"
        }
    }
}