package com.dominionenergy.vidyavenkatesh.dominionenergy

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_in_menu.*

class SignInMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_menu)

        //Goes to the incident report page
        cust_ri.setOnClickListener {
            val intent = Intent(this,ReportIncident::class.java)

            startActivity(intent)
        }

        cust_sh.setOnClickListener {
            val intent = Intent(this,SmartHome::class.java)

            startActivity(intent)
        }

        recharge_button.setOnClickListener {

            val intent = Intent(this,ReportIncident::class.java)

            startActivity(intent)
        }

        safety_button.setOnClickListener {

            val intent = Intent(this,Safety::class.java)

            startActivity(intent)
        }

        alerts.setOnClickListener {

            val intent = Intent(this,Alert::class.java)

            startActivity(intent)
        }

    }
}
