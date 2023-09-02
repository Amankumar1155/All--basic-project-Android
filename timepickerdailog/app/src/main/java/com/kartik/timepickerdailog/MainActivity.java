package com.kartik.timepickerdailog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
EditText E1;

int hr,min;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        E1 = findViewById(R.id.editTextTextPersonName);


        E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar CA = Calendar.getInstance();
                hr = CA.get(Calendar.HOUR_OF_DAY);
                min = CA.get(Calendar.MINUTE);
            new TimePickerDialog(MainActivity.this, listner, hr,min,false).show();

            }

        });

    }
    TimePickerDialog.OnTimeSetListener listner = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker timePicker, int i, int i1) {


         if(i >12 ){
             E1.setText(i-12 +":" + i1 + "pm");

         }
         else{
             E1.setText(i +":" + i1 + "am");
         }

        }
    };
}