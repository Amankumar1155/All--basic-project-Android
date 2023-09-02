package com.karan.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    RadioButton r1,r2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editTextTextPersonName2);
        r1=findViewById(R.id.radio1);
        r2=findViewById(R.id.radio2);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r1.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Welcome to Anvi Infotech Mr"+editText.getText(), Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Welcome to Anvi Infotech Ms"+editText.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}