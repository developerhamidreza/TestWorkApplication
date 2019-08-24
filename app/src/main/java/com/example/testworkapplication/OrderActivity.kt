package com.example.testworkapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)


        val n=intent.getStringExtra("bread")
        textviewbread.text="نان بربری: "+ n + " عدد "
        val n1=intent.getStringExtra("bread1")
        textviewbread1.text="نان لواش: "+ n1 + " عدد "
        val n2=intent.getStringExtra("bread2")
        textviewbread2.text="نان سنگک: "+ n2 + " عدد "


        buttonneworder.setOnClickListener {
            val intent=Intent(this@OrderActivity,MenuActivity::class.java)
            startActivity(intent)
        }
    }
}
