package com.aman.datepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    int y,m,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editTextDate);
        Calendar ca= Calendar.getInstance();
        y=ca.get(Calendar.YEAR);
        m=ca.get(Calendar.MONTH);
        d=ca.get(Calendar.DAY_OF_MONTH);
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(MainActivity.this,listener,y,m
                        ,d).show();
                editText.isShown();
            }
        });
    }
    DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {


        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            editText.setText(dayOfMonth+" / "+(month+1)+" / "+year);
            y=year;
            m=month;
            d=d;

        }
    };
}