package com.karan.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t1=findViewById(R.id.textView4);
        t2=findViewById(R.id.textView7);
        t3=findViewById(R.id.textView8);
        t4=findViewById(R.id.textView9);
        t5=findViewById(R.id.textView10);
        t6=findViewById(R.id.textView11);
        Bundle b=getIntent().getExtras();
        String n=b.getString("name_key");
        String p=b.getString("phone_key");
        String c=b.getString("course_key");
        String f=b.getString("faculty_key");
        String g=b.getString("gender_key");
        String s=b.getString("scholar_key");
        t1.setText(n);
        t2.setText(p);
        t3.setText(c);
        t4.setText(f);
        t5.setText(g);
        t6.setText(s);
    }
}