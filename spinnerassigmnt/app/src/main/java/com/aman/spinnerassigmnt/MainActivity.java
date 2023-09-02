package com.aman.spinnerassigmnt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity
{
 Spinner spinner;
 TextView text;
 Button btn;
 String country[];
 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);
  btn = findViewById(R.id.button);
  spinner = findViewById(R.id.spinner);
  text = findViewById(R.id.textView);
  country = getResources().getStringArray(R.array.values);
  ArrayAdapter<String> arrayAdapter;
  //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,country);

  arrayAdapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, country);
  spinner.setAdapter(arrayAdapter);
  btn.setOnClickListener(new View.OnClickListener() {
   @Override
   public void onClick(View view) {
    String item = spinner.getSelectedItem().toString();
    text.setText(item);
    Toast.makeText(MainActivity.this, "Welcome to :- " + item, Toast.LENGTH_SHORT).show();
   }
  });
 }



