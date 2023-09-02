package com.kartik.assignmentlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView2);

        Bundle b = getIntent().getExtras();

        String d = b.getString("desc_key");
        String t = b.getString("name_key");

        t1.setText(d);
        t2.setText(t);
    }
}