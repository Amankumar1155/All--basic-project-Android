package com.karan.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView t;
    Spinner s1;
    String courses[],faculty[];
    RadioButton r1,r2;
    Switch sw1;
    CheckBox c1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editTextTextPersonName2);
        e2=findViewById(R.id.editTextTextPersonName3);
        t=findViewById(R.id.textView5);
        s1=findViewById(R.id.spinner);
        r1=findViewById(R.id.radio1);
        r2=findViewById(R.id.radio2);
        sw1=findViewById(R.id.switch1);
        c1=findViewById(R.id.checkBox);
        courses=getResources().getStringArray(R.array.data);
        faculty=getResources().getStringArray(R.array.data2);
        ArrayAdapter<String>adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,courses);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                t.setText(faculty[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        s1.setAdapter(adapter);

        b1=findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String Name=e1.getText().toString();
                String Phone=e2.getText().toString();
                String Gender=null;
                if (r1.isChecked())
                {
                    Gender="Male";
                }
                else
                {
                    Gender="Female";
                }
                String Scholar=null;
                if (sw1.isChecked())
                {
                    Scholar="Yes";
                }
                else
                {
                    Scholar="No";
                }
                String Course=s1.getSelectedItem().toString();
                String faculty=t.getText().toString();
               if (c1.isChecked())
               {
                   Intent i=new Intent(MainActivity.this,SecondActivity.class);
                   i.putExtra("name_key",Name);
                   i.putExtra("phone_key",Phone);
                   i.putExtra("course_key",Course);
                   i.putExtra("faculty_key",faculty);
                   i.putExtra("gender_key",Gender);
                   i.putExtra("scholar_key",Scholar);
                   startActivity(i);
               }
               else
               {
                   Toast.makeText(MainActivity.this, "Please Accept T&C", Toast.LENGTH_SHORT).show();
               }
            }
        });
    }
}