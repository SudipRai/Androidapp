package com.sudip.mykotlinapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class ActivityCaledar : AppCompatActivity() {
    private lateinit var btncalendar: Button
    private lateinit var txtcalendar: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caledar)

        btncalendar = findViewById(R.id.btncalendar)
        txtcalendar = findViewById(R.id.txtcalendar)

        btncalendar.setOnClickListener {
            loadCalendar()
        }
    }

    private fun loadCalendar() {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog=DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener() { view, yearNew, monthOfYear, dayOfMonth ->
                txtcalendar.text = "Selected Date= $dayOfMonth/${monthOfYear+1}/$yearNew"
            },
        year,
        month,
        day
        )
        datePickerDialog.show()
    }
}
