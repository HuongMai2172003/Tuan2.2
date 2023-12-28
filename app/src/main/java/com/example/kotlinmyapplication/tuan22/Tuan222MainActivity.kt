package com.example.kotlinmyapplication.tuan22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.kotlinmyapplication.R

class Tuan222MainActivity : AppCompatActivity() {
    var lv:ListView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan222_main)
        lv= findViewById(R.id.tuan22ListView)
        val arr = arrayOf("Mon 1 ", "Mon 2","Mon 3","Mon 4","Mon 5","Mon 6")
        // adapter
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,arr)
        // hien thi len
        lv!!.setAdapter(adapter);
    }
}