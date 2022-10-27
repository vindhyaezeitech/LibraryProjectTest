package com.wof.libraryprojecttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wof.captchalib.CaptchaActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CaptchaActivity.startCaptchaActivity(this);

    }
}