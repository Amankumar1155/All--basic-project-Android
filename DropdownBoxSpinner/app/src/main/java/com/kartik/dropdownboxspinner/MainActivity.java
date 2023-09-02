package com.kartik.dropdownboxspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Spinner s1;
Button b1;

String Players[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1 = findViewById(R.id.spinner);
        b1 = findViewById(R.id.button);

        Players = getResources().getStringArray(R.array.Players); //To access the array Which Stored in string.xml

        //used Array Adpater Class to connect the array and the Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Players);
        s1.setAdapter(adapter);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String item = s1.getSelectedItem().toString();
                Toast.makeText(MainActivity.this, "Welcome Mr. " +item, Toast.LENGTH_SHORT).show();
            }
        });


    }
}