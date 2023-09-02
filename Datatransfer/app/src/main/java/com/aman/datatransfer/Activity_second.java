package com.aman.datatransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity_second extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text=findViewById(R.id.textView);
        Bundle b=getIntent().getExtras();
        String n=b.getString("name_key");
        String p=b.getString("phone_key");
        text.setText(n+"\n"+p);

    }
}