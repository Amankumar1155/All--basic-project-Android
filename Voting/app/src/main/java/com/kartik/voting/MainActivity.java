package com.kartik.voting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editTextTextPersonName3);
        b1 = findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int age = Integer.parseInt(e1.getText().toString());


                if(age <=5){
                    Toast.makeText(MainActivity.this, "Go to Counter 1 for polio Drop ", Toast.LENGTH_SHORT).show();
                    e1.setText("");

                }
               else if( age>= 6 && age <=10){
                    Toast.makeText(MainActivity.this, "Go to Counter 2 for Vaccination", Toast.LENGTH_SHORT).show();
                }
                else if ( age>= 11 && age <= 15) {

                    Toast.makeText(MainActivity.this, "Go to Counter 3 for Vitamins", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Go to Home", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}