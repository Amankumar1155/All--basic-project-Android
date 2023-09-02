package com.aman.spinnerassigmnt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button btn;
    Spinner spinner;
    String place[];
    String ds[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        btn=findViewById(R.id.button);
        spinner=findViewById(R.id.spinner);
        place=getResources().getStringArray(R.array.values);
        ds=getResources().getStringArray(R.array.desc);
        ArrayAdapter<String>arrayAdapter;
        arrayAdapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,place);
        spinner.setAdapter(arrayAdapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int position = spinner.getSelectedItemPosition();
               textView.setText(ds[position]);
            }
        });


    }
}