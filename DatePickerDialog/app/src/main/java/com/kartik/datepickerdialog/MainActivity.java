package com.kartik.datepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
EditText d1;
int y,m,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d1 = findViewById(R.id.editTextDate);

        Calendar ca = Calendar.getInstance();
        y = ca.get(Calendar.YEAR);

        m = ca.get(Calendar.MONTH);
        d = ca.get(Calendar.DAY_OF_MONTH);

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(MainActivity.this,listner,y,m,d).show();
            }
        });
    }
    DatePickerDialog.OnDateSetListener listner = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
            d1.setText(i2+"-"+(i1+1) + "-"+i);
            y = i; m = i1 ; d=i2;
        }
    };
}