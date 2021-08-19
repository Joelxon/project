package com.example.delgram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.delgram.databinding.ActivityLoginBinding
import com.joelson.delgram.SignUpActivity
import com.joelson.delgram.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ActivityLoginBinding: ActivityLoginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(ActivityLoginBinding.root)

        val tvSignup = ActivityLoginBinding.signUp
        tvSignup.setOnClickListener {
            val intent: Intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }


    }
}