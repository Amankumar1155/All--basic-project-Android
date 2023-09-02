package com.kartik.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView l1;
ArrayList<String> arrayList;
ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1 = findViewById(R.id.listview);
        arrayList = new ArrayList<String>();
        arrayList.add("Rajma Chawal");
        arrayList.add("Lassi");
        arrayList.add("Chana Masala");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayList);

        l1.setAdapter(adapter);
        registerForContextMenu(l1);



    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.add("Delete");
        menu.add("Rename");
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
       switch (item.getTitle().toString())
       {
           case "Delete":
               Toast.makeText(this, "Deleted", Toast.LENGTH_SHORT).show();
               break;
           case "Rename":
               Toast.makeText(this, "Renamed", Toast.LENGTH_SHORT).show();
                   break;

       }
        return super.onContextItemSelected(item);
    }
}

