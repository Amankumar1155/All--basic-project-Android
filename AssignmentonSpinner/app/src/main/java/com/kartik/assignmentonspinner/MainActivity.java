package com.kartik.assignmentonspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView t1;
Spinner s1;
String Places[],values[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1 = findViewById(R.id.spinner);
        t1 = findViewById(R.id.textView);
        Places = getResources().getStringArray(R.array.Places);
        values = getResources().getStringArray(R.array.values);


        ArrayAdapter <String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Places);
        s1.setAdapter(adapter);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Toast.makeText(MainActivity.this, "Please Select Places", Toast.LENGTH_SHORT).show();
                }
                else{
                    t1.setText(values[i]);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}