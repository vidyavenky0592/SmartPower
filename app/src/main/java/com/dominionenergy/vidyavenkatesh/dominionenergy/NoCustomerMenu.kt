package com.dominionenergy.vidyavenkatesh.dominionenergy

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_no_customer_menu.*

class NoCustomerMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_no_customer_menu)

        ncust_create_account2.setOnClickListener {

            val intent = Intent(this,CreateAccount::class.java)
            startActivity(intent)

        }

        report.setOnClickListener {
            val intent = Intent(this,ReportIncident::class.java)
            startActivity(intent)
        }

        ncust_safety.setOnClickListener {
            val intent = Intent(this,Safety::class.java)
            startActivity(intent)

        }

        ncust_alert.setOnClickListener {

            val intent = Intent(this,Alert::class.java)
            startActivity(intent)
        }

    }
}
