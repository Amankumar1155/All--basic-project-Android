package com.karan.dynamiclist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    Button b1;
    ListView l1;
    ArrayList<String>arrayList;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editText);
        b1=findViewById(R.id.Button);
        l1=findViewById(R.id.listview);
        arrayList=new ArrayList<String>() ;//Dynamic Array
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayList);
        l1.setAdapter(arrayAdapter);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
              String name=e1.getText().toString();
              arrayList.add(name);
              arrayAdapter.notifyDataSetChanged();
            }
        });
    }
}