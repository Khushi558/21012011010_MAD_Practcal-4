package com.example.a21012011010_mad_practcal_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val signup: Button =findViewById(R.id.button3)
        signup.setOnClickListener {
            Intent(this,RegistrationActivity::class.java).also { startActivity(it) }
        }
    }
}
