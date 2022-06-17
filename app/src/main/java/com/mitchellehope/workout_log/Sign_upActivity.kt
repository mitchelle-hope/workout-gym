package com.mitchellehope.workout_log

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.mitchellehope.workout_log.databinding.ActivityLoginBinding
import com.mitchellehope.workout_log.databinding.ActivitySignUpBinding

class Sign_upActivity : AppCompatActivity() {
lateinit var binding:ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnSignup.setOnClickListener { validateLogin() }

        binding.tvLogin.setOnClickListener{
            var intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }

    }

    fun validateLogin(){
        var error= false
        binding.tilSignemail.error=null
        binding.tilPass.error=null
        var email=binding.etSignemail.text.toString()
        if (email.isBlank()) {
            binding.tilSignemail.error="Email is required"
            error=true
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            binding.tilSignemail.error="not a valid email"
            error=true
        }
        var password =binding.etPass.text.toString()
        if (password.isBlank()) {
           binding.tilPass.error="password is required"
            error =true

        }
        if(!error){

        }
        var firstname =binding.etFirstName.toString()
        if (firstname.isBlank()) {
           binding.tilFirstname.error="Your first name is required"
            error =true


            }
        var lastname =binding.etLastname.toString()
        if (lastname.isBlank()) {
            binding.tilLastname.error="Your last name is required"
            error =true



        }
        var confirmpass =binding.etConfirm.toString()
        if (confirmpass.isBlank()) {
           binding.tilConfirm.error="Your last name is required"
            error =true



        }
        if (password != confirmpass){
            binding.tilConfirm.error = "Invalid Password"
        }
}


    }







