package com.example.testworkapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


//        Handler().postDelayed({
//            val intent= Intent(this@SplashActivity,MenuPageActivity::class.java)
//            startActivity(intent)
//        }, 2000)

        Handler().postDelayed({
            val intent = Intent(this@SplashActivity, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)

    }
}
