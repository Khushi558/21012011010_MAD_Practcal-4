package com.example.a21012011010_mad_practcal_4
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.math.sign
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login:Button=findViewById(R.id.button)
        login.setOnClickListener {
            Intent(this,LoginActivity::class.java).also { startActivity(it) }
        }
        val signup:Button=findViewById(R.id.button2)
        signup.setOnClickListener {
            Intent(this,RegistrationActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}
