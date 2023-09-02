package com.aman.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button t1,t2,t3;
    SharedPreferences pref;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editTextTextPersonName);
        e2=findViewById(R.id.editTextTextPersonName1);
        t1=findViewById(R.id.button1);
        t2=findViewById(R.id.button2);
        t3=findViewById(R.id.button3);
        pref=getSharedPreferences("mydata",Context.MODE_PRIVATE);
        //editor=pref.edit();
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = e1.getText().toString();
                String weather = e2.getText().toString();
                editor.putString("location_key",location);
                editor.putString("weather_key",weather);
                editor.commit();
                Toast.makeText(MainActivity.this, "Data Update Successfully", Toast.LENGTH_SHORT).show();

            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String l =  pref.getString("location_key",null);
              String w =  pref.getString("phone_key",null);

                Toast.makeText(MainActivity.this,l+"\n"+w, Toast.LENGTH_SHORT).show();
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.clear();
                editor.commit();
            }
        });

    }
}