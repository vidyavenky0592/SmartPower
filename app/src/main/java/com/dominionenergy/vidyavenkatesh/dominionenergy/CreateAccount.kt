package com.dominionenergy.vidyavenkatesh.dominionenergy

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_create_account.*

class CreateAccount : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)


        create_submit.setOnClickListener {

            val intent = Intent(this,SignInMenu::class.java)

            startActivity(intent)

        }
    }
}
