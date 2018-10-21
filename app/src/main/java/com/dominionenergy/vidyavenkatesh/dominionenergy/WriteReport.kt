package com.dominionenergy.vidyavenkatesh.dominionenergy

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.PopupWindow
import kotlinx.android.synthetic.main.activity_write_report.*

class WriteReport : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_write_report)


        report_send.setOnClickListener {

            val window = PopupWindow(this)
            val view =  layoutInflater.inflate(R.layout.activity_pop_up,null)
            window.contentView = view

            val imageView =  view.findViewById<ImageView>(R.id.imageView)
            imageView.setOnClickListener {

                val intent = Intent(this,ReportIncident::class.java)

                startActivity(intent)


            }

            window.showAsDropDown(report_send)

        }



    }
}
