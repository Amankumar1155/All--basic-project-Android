package com.kartik.sqlitedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kartik.sqlitedatabase.database.Database_Handler;
import com.kartik.sqlitedatabase.model.EmpRecord;

public class MainActivity extends AppCompatActivity {
Database_Handler handler;

EditText e1,e2,e3;
Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler = new Database_Handler(this);
        e1 = findViewById(R.id.editTextNumber);
        e2  = findViewById(R.id.editTextTextPersonName);
        e3 = findViewById(R.id.editTextNumber3);
        b1 = findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = Integer.parseInt(e1.getText().toString());
                String name = e2.getText().toString();
                String salary = e3.getText().toString();

                EmpRecord record = new EmpRecord(id , name,salary);

              long result =   handler.insertRecord(record);

              if(result > 0 ){
                  Toast.makeText(MainActivity.this, "Data Saved", Toast.LENGTH_SHORT).show();
              }
              else
                  Toast.makeText(MainActivity.this, "Query Problem", Toast.LENGTH_SHORT).show();

            }
        });

    }
}