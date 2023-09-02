package com.aman.timepickerd;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.sql.Time;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    int h,m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editTextDate);


        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar ca = Calendar.getInstance();
                h=ca.get(Calendar.HOUR_OF_DAY);
                m=ca.get(Calendar.MINUTE);
                new TimePickerDialog(MainActivity.this,listener,h,m,true).show();


            }
        });
    }
    TimePickerDialog.OnTimeSetListener listener = new TimePickerDialog.OnTimeSetListener(){



        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            h=hourOfDay;
            m=minute;
        }

        };
    }