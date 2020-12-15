package com.sudip.mykotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AlertDialogue : AppCompatActivity() {
    private lateinit var btnalert:Button
    private lateinit var txtone:EditText
    private lateinit var txttwo:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialogue)

        btnalert=findViewById(R.id.btnalert)
        txtone=findViewById(R.id.txtone)
        txttwo=findViewById(R.id.txttwo)

        btnalert.setOnClickListener {
            val builder= AlertDialog.Builder(this)
            builder.setTitle("This is Alert")
            builder.setMessage("Are you Sure")
            builder.setIcon(android.R.drawable.ic_dialog_alert)
            builder.setPositiveButton("Yes")
            {
                _,_ ->
                val a=txtone.text.toString().toInt()
                val b= txttwo.text.toString().toInt()
                val sum=a+b

                Toast.makeText(applicationContext, "$sum", Toast.LENGTH_LONG).show()

            }
            builder.setNeutralButton("Cancel")
            {
                _,_ ->
                Toast.makeText(applicationContext, "clicked cancel", Toast.LENGTH_LONG).show()

            }
            builder.setNegativeButton("No")
            {
                _,_ ->
                Toast.makeText(applicationContext, "clicked no", Toast.LENGTH_LONG).show()

            }
            val alertDialog:AlertDialog=builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()


        }
    }
}