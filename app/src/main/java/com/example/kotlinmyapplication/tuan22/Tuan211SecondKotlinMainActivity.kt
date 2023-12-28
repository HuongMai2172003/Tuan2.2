package com.example.kotlinmyapplication.tuan22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.kotlinmyapplication.R

class Tuan211SecondKotlinMainActivity : AppCompatActivity() {
    var tv1 : TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan211_second_kotlin_main)
        tv1=findViewById(R.id.textView2)
        var i1=intent
        val chuoi1=i1.extras!!.getString("so1")
        val chuoi2=i1.extras!!.getString("so2")
        var so1=chuoi1!!.toFloat()
        var so2=chuoi2!!.toFloat()
        val tong =so1+so2
        tv1!!.text=tong.toString()
    }
}