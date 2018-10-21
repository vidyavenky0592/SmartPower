package com.dominionenergy.vidyavenkatesh.dominionenergy

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_smart_home.*

class SmartHome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smart_home)


        earn_points.setOnClickListener {

            val intent = Intent(this,EarnPoints::class.java)

            startActivity(intent)


        }



    }
}
