package com.wof.captchalib

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CaptchaActivity : AppCompatActivity() {

    companion object{
        fun startCaptchaActivity( context:Context){
            context.startActivity(Intent(context, CaptchaActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_captcha)
    }
}