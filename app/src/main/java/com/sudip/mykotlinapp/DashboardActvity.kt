package com.sudip.mykotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class DashboardActvity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnone: Button
    private lateinit var btntwo: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_actvity)

        btnone = findViewById(R.id.btnone)
        btntwo = findViewById(R.id.btntwo)
        btnone.setOnClickListener(this)
        btntwo.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnone -> {
                val intent = Intent(
                    this,
                    ListviewActivity2::class.java
                )
                startActivity(intent)

            }

            R.id.btntwo -> {
                val intent = Intent(
                    this,
                    ActivityCaledar::class.java
                )
                startActivity(intent)
            }
        }
    }
}