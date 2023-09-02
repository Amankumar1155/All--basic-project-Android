package com.kartik.secondintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t1 = findViewById(R.id.textView);
      Bundle b =   getIntent().getExtras();

      String n = b.getString("name_key");
        String p = b.getString("phone_key");

        t1.setText("Name "+n+"\nPhone: "+p);
    }
}