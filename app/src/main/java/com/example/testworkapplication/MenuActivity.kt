package com.example.testworkapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        buttonconfirmbread.setOnClickListener {
            val s = edittextbread.text.toString()
            val s1 = edittextbread1.text.toString()
            val s2 = edittextbread2.text.toString()


            if (!s.isBlank() && !s1.isBlank() && !s2.isBlank()) {
                val intent = Intent(this@MenuActivity, OrderActivity::class.java)
                intent.putExtra("bread", s)
                intent.putExtra("bread1", s1)
                intent.putExtra("bread2", s2)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "لطفا سفارشتان را تکمیل کنید!!", Toast.LENGTH_SHORT).show()
            }


        }


    }
}

