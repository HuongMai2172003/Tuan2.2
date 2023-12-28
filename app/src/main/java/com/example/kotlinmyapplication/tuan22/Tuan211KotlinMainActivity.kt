package com.example.kotlinmyapplication.tuan22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.kotlinmyapplication.R

class Tuan211KotlinMainActivity : AppCompatActivity() {
    var txt1: EditText? = null
    var txt2: EditText? = null
    var btn1: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan211_kotlin_main)
        txt1 = findViewById(R.id.demotext1)
        txt2 = findViewById(R.id.demotext2)
        btn1 = findViewById(R.id.button)

        btn1!!.setOnClickListener {
            // Sử dụng biến tạm thời để tránh lỗi Smart cast
            val so1Value = txt1?.text.toString()
            val so2Value = txt2?.text.toString()

            val i = Intent(this@Tuan211KotlinMainActivity, Tuan211SecondKotlinMainActivity::class.java)
            i.putExtra("so1", so1Value)
            i.putExtra("so2", so2Value)
            startActivity(i)
        }
    }
}
