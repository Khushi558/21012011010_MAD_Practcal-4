package com.example.a21012011010_mad_practcal_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrationActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        val login:Button=findViewById(R.id.signuptologin)
        login.setOnClickListener {
            Intent(this,LoginActivity::class.java).also { startActivity(it) }
        }
    }
}
