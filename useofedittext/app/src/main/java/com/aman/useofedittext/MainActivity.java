package com.aman.useofedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText editText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();
                if (name.isEmpty()) {
                    editText.setError("Please Enter Name");
                } else {
                    Toast.makeText(MainActivity.this, "welcome to ainwik info " + name, Toast.LENGTH_SHORT).show();
                    editText.setText("");
                }
            }
            });

    }
}