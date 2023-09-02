package com.gm.informationportal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class InfoPageActivity extends AppCompatActivity {

    TextView t1, t2, t3, t4, t5, t6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_page);

        t1 = findViewById(R.id.textView17);
        t2 = findViewById(R.id.textView13);
        t3 = findViewById(R.id.textView14);
        t4 = findViewById(R.id.textView12);
        t5 = findViewById(R.id.textView15);
        t6 = findViewById(R.id.textView16);

        Bundle b = getIntent().getExtras();

        String n = b.getString("name_key");
        String p = b.getString("phone_key");
        String c = b.getString("course_key");
        String f = b.getString("faculty_key");
        String g = b.getString("gender_key");
        String s = b.getString("scholar_key");

        t1.setText(n);
        t2.setText(p);
        t3.setText(c);
        t4.setText(f);
        t5.setText(g);
        t6.setText(s);

    }
}