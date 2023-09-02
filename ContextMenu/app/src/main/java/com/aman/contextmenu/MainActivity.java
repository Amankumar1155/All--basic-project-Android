package com.aman.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button btn;
    ListView l1;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        txt=findViewById(R.id.entername);
        btn=findViewById(R.id.btt);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1 = findViewById(R.id.listview);
        arrayList = new ArrayList<String>();
        arrayList.add("Chole Bhature");
        arrayList.add("mix veg");
        arrayList.add("Roasted chicken masla");
        arrayList.add("z");
        arrayList.add("z");
        arrayList.add("z");
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
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
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        int index = info.position;
        switch (item.getTitle().toString()) {
            case "Delete":
                arrayList.remove(index);
                adapter.notifyDataSetChanged();
                Toast.makeText(this, "Deleted", Toast.LENGTH_SHORT).show();
                break;
            case "Rename":

                Toast.makeText(this, "Renamed", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.option, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Dialog d=new Dialog(this);
        d.setContentView(R.layout.dialog);
        d.setCanceledOnTouchOutside(false);

        EditText editText = d.findViewById(R.id.entername);
        Button button = d.findViewById(R.id.btt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();

                if (value.isEmpty()) {
                    editText.setError("enter name first");
                } else {
                    arrayList.add(value);
                    adapter.notifyDataSetChanged();
                    d.dismiss();
                }
            }
        });
        d.show();
        return super.onOptionsItemSelected(item);
    }

}



