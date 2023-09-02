package com.kartik.first_event_handling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn,btn2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
        btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view == btn){
            Toast.makeText(this, "Welcome to Kartik Bhatt World", Toast.LENGTH_SHORT).show();
        }
       else {
            Toast.makeText(this, "The Boys is the Best", Toast.LENGTH_SHORT).show();
        }
    }
}