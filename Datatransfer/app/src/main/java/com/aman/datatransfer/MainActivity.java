package com.aman.datatransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.editText);
        t2=findViewById(R.id.editTextPhone);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String name = t1.getText().toString();
               String phone = t2.getText().toString();
                Intent i=new Intent(MainActivity.this,Activity_second.class);
                i.putExtra("name_key",name);
                i.putExtra("phone_key",name);
                startActivity(i);

            }
        });
    }
}