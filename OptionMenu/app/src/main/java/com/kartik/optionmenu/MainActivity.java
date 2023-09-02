package com.kartik.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);

        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

       switch(item.getItemId()){

           case R.id.item1:
               Toast.makeText(this, "Ni", Toast.LENGTH_SHORT).show();
               break;

           case R.id.item2:
               Toast.makeText(this, "Bola", Toast.LENGTH_SHORT).show();
               break;

           case R.id.item3:
               Intent i = new Intent(Settings.ACTION_SETTINGS);
               startActivity(i);
               break;

       }

        return super.onOptionsItemSelected(item);
    }
}