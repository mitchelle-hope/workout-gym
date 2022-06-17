package com.mitchellehope.workout_log

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.mitchellehope.workout_log.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnLogin.setOnClickListener { validateLogin()
        startActivity(Intent(this,HomeActivity::class.java))}
        binding.tvSignup.setOnClickListener{
            var intent=Intent(this,Sign_upActivity::class.java)
            startActivity(intent)
        }

    }

    fun validateLogin(){
        var error= false
        binding.tilEmail.error=null
        binding.tilPassword.error=null
        var email=binding.etEmail.text.toString()
        if (email.isBlank()) {
            binding.tilEmail.error="Email is required"
            error=true
        }
        var password =binding.etPassword.text.toString()
        if (password.isBlank()) {
            binding.tilPassword.error="password is required"
            error =true

        }
        if(!error){

        }
    }

}




