package com.dominionenergy.vidyavenkatesh.dominionenergy

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_report_incident.*

class ReportIncident : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report_incident)

        ncust_r_submit.setOnClickListener {

            val intent =  Intent(this,WriteReport::class.java)

            startActivity(intent)



        }

        //TODO put the other buttons

    }
}
