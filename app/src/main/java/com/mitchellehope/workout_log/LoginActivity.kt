package com.mitchellehope.workout_log

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var btnLogin:Button
    lateinit var tilEmail:TextInputLayout
    lateinit var etEmail: TextInputEditText
    lateinit var tilPassword:TextInputLayout
    lateinit var etPassword:TextInputEditText
    lateinit var tvSignup:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin = findViewById(R.id.btnLogin)
        tilEmail = findViewById(R.id.tilEmail)
        etEmail = findViewById(R.id.etEmail)
        tilPassword = findViewById(R.id.tilPassword)
        etPassword = findViewById(R.id.etPassword)
        tvSignup=findViewById(R.id.tvSignup)

        btnLogin.setOnClickListener { validateLogin() }
        tvSignup.setOnClickListener{
            var intent=Intent(this,Sign_upActivity::class.java)
            startActivity(intent)
        }

    }

    fun validateLogin(){
        var error= false
        tilEmail.error=null
        tilPassword.error=null
        var email=etEmail.text.toString()
        if (email.isBlank()) {
            tilEmail.error="Email is required"
            error=true
        }
        var password =etPassword.text.toString()
        if (password.isBlank()) {
            tilPassword.error="password is required"
            error =true

        }
        if(!error){

        }
    }

}



