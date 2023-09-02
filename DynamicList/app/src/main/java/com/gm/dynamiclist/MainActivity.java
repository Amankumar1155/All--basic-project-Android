package com.gm.dynamiclist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText e1;
    ListView lv;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.editText);
        btn = findViewById(R.id.button);
        lv = findViewById(R.id.listView);

        arrayList = new ArrayList<String>(); //Dynamic array list
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayList);

        lv.setAdapter(arrayAdapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = e1.getText().toString();
                if(data.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Data..", Toast.LENGTH_SHORT).show();
                }
                else {
                        arrayList.add(data);
                        arrayAdapter.notifyDataSetChanged();
                    }
                e1.setText("");
            }
        });
    }
}