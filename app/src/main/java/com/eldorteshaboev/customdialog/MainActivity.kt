package com.eldorteshaboev.customdialog

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_no_connection.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_noConnection.setOnClickListener {
            val builder = AlertDialog.Builder(this).create()
            val customDialog = LayoutInflater.from(this).inflate(R.layout.custom_no_connection, null, false)
            builder.setView(customDialog)

            builder.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

            customDialog.cancel_xml.setOnClickListener {
                Toast.makeText(this, "canceled", Toast.LENGTH_SHORT).show()
            }
            customDialog.retry_xml.setOnClickListener {
                Toast.makeText(this, "retried", Toast.LENGTH_SHORT).show()
            }
            builder.show()
        }

    }


}
