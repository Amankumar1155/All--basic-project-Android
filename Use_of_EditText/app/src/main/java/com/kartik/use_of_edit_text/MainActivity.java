package com.kartik.use_of_edit_text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText,editText1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextTextPersonName);
        editText1 = findViewById(R.id.editTextTextPersonName2);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();
                String password = editText1.getText().toString();;
              //  if(name.isEmpty() )
               // {
                 //   editText.setError(" Enter your UserName  "); // when the name is empty
              //  }

                    if (name.equals("Anwik") && password.equals("12345")) {
                        Toast.makeText(MainActivity.this, "Login Successful" + name, Toast.LENGTH_SHORT).show();
                        editText.setText(""); // used to reset the Name
                        editText1.setText("");
                    } else {
                        Toast.makeText(MainActivity.this, "Invalid User"+name, Toast.LENGTH_SHORT).show();
                    }




            }
        });
    }
}