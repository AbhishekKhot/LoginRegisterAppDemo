package com.example.loginactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    lateinit var btn:Button
    lateinit var GoogleBtn:Button
    lateinit var facebookBtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn=findViewById(R.id.ButtonLogin)
        btn.setOnClickListener {
            Toast.makeText(this,"Congratulation, you have successfully logged in please wait",Toast.LENGTH_LONG).show()
        }
        GoogleBtn=findViewById(R.id.ButtonGoogle)
        facebookBtn=findViewById(R.id.ButtonFacebook)

        GoogleBtn.setOnClickListener {
            Toast.makeText(this,"Select the google account for login",Toast.LENGTH_LONG).show()
        }
        facebookBtn.setOnClickListener {
            Toast.makeText(this,"Enter the your Facebook creditional here",Toast.LENGTH_LONG).show()
        }
    }

    fun accountClick(view: android.view.View) {
        Toast.makeText(this,"please select recovery method",Toast.LENGTH_LONG).show()
    }
}