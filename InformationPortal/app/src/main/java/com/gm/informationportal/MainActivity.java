package com.gm.informationportal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
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

    EditText name, phone;
    Spinner sp;
    TextView faculty;
    RadioButton male,female;
    Switch scholar;
    CheckBox tc;
    Button btn;
    String course[], fname[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editText);
        phone = findViewById(R.id.editText2);
        sp = findViewById(R.id.spinner);
        faculty = findViewById(R.id.textView);
        male = findViewById(R.id.radiom);
        female = findViewById(R.id.radiof);
        scholar = findViewById(R.id.switch1);
        tc = findViewById(R.id.checkBox);
        btn = findViewById(R.id.button);
        course = getResources().getStringArray(R.array.courses);
        fname = getResources().getStringArray(R.array.faculty);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,course);
        sp.setAdapter(adapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                faculty.setText(fname[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Name = name.getText().toString();
                String Phone = phone.getText().toString();
                String Gender = null;
                String Scholar = null;
                String Course = sp.getSelectedItem().toString();
                String Faculty = faculty.getText().toString();

                if(male.isChecked()){
                    Gender = "Male";
                }
                else if(female.isChecked()){
                    Gender = "Female";
                }

                if(scholar.isChecked()){
                    Scholar = "Yes";
                }else{
                    Scholar = "No";
                }

                if(Name.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Name", Toast.LENGTH_SHORT).show();
                }
                else if(Phone.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Phone Number", Toast.LENGTH_SHORT).show();
                }
                else if(sp.getSelectedItem()==course[0]) {
                    Toast.makeText(MainActivity.this, "Select Course", Toast.LENGTH_SHORT).show();
                }
                else if (male.isChecked() == false && female.isChecked() == false) {
                    Toast.makeText(MainActivity.this, "Select Gender", Toast.LENGTH_SHORT).show();
                }
                else if (tc.isChecked() == false) {
                    Toast.makeText(MainActivity.this, "Accept Terms and Conditions", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i = new Intent(MainActivity.this, InfoPageActivity.class);

                    i.putExtra("name_key",Name);
                    i.putExtra("phone_key",Phone);
                    i.putExtra("course_key",Course);
                    i.putExtra("faculty_key",Faculty);
                    i.putExtra("gender_key",Gender);
                    i.putExtra("scholar_key",Scholar);

                    startActivity(i);
                }
            }
        });
    }
}