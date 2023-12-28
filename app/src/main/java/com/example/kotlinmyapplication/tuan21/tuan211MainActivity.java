package com.example.kotlinmyapplication.tuan21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.kotlinmyapplication.R;

public class tuan211MainActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan211_main);
        //anh xa
        txt1=findViewById(R.id.demotext1);
        txt2=findViewById(R.id.demotext2);
        btn1=findViewById(R.id.button);
//tao su kien click button
        btn1.setOnClickListener(v->{
            //dinh huong di chuyen
            Intent i=new Intent(tuan211MainActivity.this,tuan211secondActivity.class);
            i.putExtra("so1",txt1.getText().toString());
            i.putExtra("so2",txt2.getText().toString());
            //khoi hanh
            startActivity(i);
        });
    }
}
