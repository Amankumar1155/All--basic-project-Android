package com.karan.datepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    int y,m,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editTextDate3);
        Calendar ca=Calendar.getInstance();
        y=ca.get(Calendar.YEAR);
        m=ca.get(Calendar.MONTH);
        d=ca.get(Calendar.DAY_OF_MONTH);
        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(MainActivity.this,Listener,y,m,d).show();

            }
        });
    }
    DatePickerDialog.OnDateSetListener Listener=new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
           e1.setText(i2+" - "+(i1+1)+" - "+i);
        }
    };
}