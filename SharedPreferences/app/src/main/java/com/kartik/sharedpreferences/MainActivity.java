
// Shared Preferences is use to small amount of data
//it is always to store the data in .xml and this data format is in key and value pair
package com.kartik.sharedpreferences;

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
Button b1,b2,b3;
SharedPreferences pref;
SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editTextTextPersonName);
        e2 = findViewById(R.id.editTextTextPersonName2);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);

        pref = getSharedPreferences("mydata", Context.MODE_PRIVATE);
        editor = pref.edit(); // through this we can take input from user and it will store the data in our phone

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
            String location = e1.getText().toString();
            String weather = e2.getText().toString();

            editor.putString("Location_key",location);
            editor.putString("Weather_key", weather);
            editor.commit();

                Toast.makeText(MainActivity.this, "Data Updated Successfully", Toast.LENGTH_SHORT).show();


            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             String l = pref.getString("location_key", null);
             String w = pref.getString("weather_key", null);

                Toast.makeText(MainActivity.this, l+"\n"+w , Toast.LENGTH_SHORT).show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.clear();
                editor.commit();

            }
        });

    }
}