package com.kartik.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton r1,r2;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = findViewById(R.id.radio1);
        r2 = findViewById(R.id.radio2);
        btn = findViewById(R.id.button);
        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if(r1.isChecked())
                {
                    String value = r1.getText().toString();
                    Toast.makeText(MainActivity.this, "You have Been Selected"+value, Toast.LENGTH_SHORT).show();
                }
                else{
                    String value = r2.getText().toString();
                    Toast.makeText(MainActivity.this, "You have Been Selected"+value, Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });
    }
}