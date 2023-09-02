package com.aman.namegender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    RadioButton r1,r2;
    Button btn;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editTextTextPersonName);
        textView=findViewById(R.id.textView2);
        r1=findViewById(R.id.Radio1);
        r2=findViewById(R.id.Radio2);
        btn=findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String name = editText.getText().toString();
                if (name.isEmpty())
                   // if(r1.isChecked())
                {
                       // result=r1.getText().toString();
                    editText.setError("Please Enter Name");
                    //r1.setError("Male && Female");
                }
                else
                {
                    if(r1.isChecked())
                    {
                        Toast.makeText(MainActivity.this, "Welcome To Ainwik Mr "+name, Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Welcome To Ainwik Mis  "+name, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}