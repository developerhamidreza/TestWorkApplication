package com.example.testworkapplication

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val s = edittextone.text.toString()
        val s1 = edittexttwo.text.toString()
        val s2 = edittextthree.text.toString()
        val s3 = edittextfore.text.toString()
        val shrd=getSharedPreferences("name",Context.MODE_PRIVATE )
            .edit()
            .putString("s",s)
            .putString("s1",s1)
            .putString("s2",s2)
            .putString("s3",s3)
            .apply()







    }
}
