package com.karan.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView l1;
    ArrayList<String>arrayList;
    ArrayAdapter<String>adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=findViewById(R.id.listview);
        arrayList=new ArrayList<>();
        arrayList.add("Messi");
        arrayList.add("Ronaldo");
        arrayList.add("Neymar");
        arrayList.add("Ramos");
        arrayList.add("Mbappe");
        arrayList.add("Benzema");
        adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);
        l1.setAdapter(adapter);
        registerForContextMenu(l1);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        menu.add("Delete");
        menu.add("Rename");
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item)
    {
        AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        int index= info.position;
        switch (item.getTitle().toString())
        {
            case "Delete":
                Toast.makeText(this, "Item Deleted", Toast.LENGTH_SHORT).show();
                break;
            case "Rename":
                Toast.makeText(this, "Item Renamed", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);
    }
}