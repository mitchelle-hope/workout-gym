package com.mitchellehope.workout_log

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class Sign_upActivity : AppCompatActivity() {
    lateinit var tilFirstname:TextInputLayout
    lateinit var etFirstName:TextInputEditText
    lateinit var tilLastname:TextInputLayout
    lateinit var etLastname:TextInputEditText
    lateinit var tilSignemail:TextInputLayout
    lateinit var etSignemail:TextInputEditText
    lateinit var tilPass:TextInputLayout
    lateinit var etPass:TextInputEditText
    lateinit var tilConfirm:TextInputLayout
    lateinit var etConfirm:TextInputEditText
    lateinit var tvSignin:TextView
    lateinit var tvLogin:TextView
    lateinit var btnSignup:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        tilFirstname = findViewById(R.id.tilFirstname)
        etFirstName = findViewById(R.id.etFirstName)
        tilLastname = findViewById(R.id.tilLastname)
        etLastname = findViewById(R.id.etLastname)
        tilSignemail = findViewById(R.id.tilSignemail)
        etSignemail = findViewById(R.id.etSignemail)
        tilPass = findViewById(R.id.tilPass)
        etPass= findViewById(R.id.etPass)
        tilConfirm = findViewById(R.id.tilConfirm)
        etConfirm = findViewById(R.id.etConfirm)
        btnSignup =findViewById(R.id.btnSignup)
        tvLogin=findViewById(R.id.tvLogin)



        tvSignin.setOnClickListener { validateLogin() }
        btnSignup.setOnClickListener { validateLogin() }
//        btnLogin.setOnClickListener { validateLogin() }
        tvLogin.setOnClickListener{
            var intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }

    }

    fun validateLogin(){
        var error= false
        tilSignemail.error=null
        tilPass.error=null
        var email=etSignemail.text.toString()
        if (email.isBlank()) {
            tilSignemail.error="Email is required"
            error=true
        }
        var password =etPass.text.toString()
        if (password.isBlank()) {
            tilPass.error="password is required"
            error =true

        }
        if(!error){

        }
        var firstname =etFirstName.text.toString()
        if (password.isBlank()) {
            tilFirstname.error="Your first name is required"
            error =true


            }
        var lastname =etLastname.text.toString()
        if (password.isBlank()) {
            tilLastname.error="Your last name is required"
            error =true



        }
        var confirmpass =etConfirm.text.toString()
        if (password.isBlank()) {
            tilLastname.error="Your last name is required"
            error =true



        }
}


    }




