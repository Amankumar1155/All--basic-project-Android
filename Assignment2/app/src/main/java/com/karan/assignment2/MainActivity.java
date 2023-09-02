package com.karan.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.editTextTextPersonName);
        et2=findViewById(R.id.editTextTextPersonName2);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = et1.getText().toString();
                String pass = et2.getText().toString();
                if (user.equals("Aniwik") && pass.equals("12346"))
                {
                    Toast.makeText(MainActivity.this, "Welcome to Aniwik", Toast.LENGTH_SHORT).show();
                }
                 else
                {
                    Toast.makeText(MainActivity.this, "Invalid User", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}