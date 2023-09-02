package com.aman.spinnertoopenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner sp;
    String str[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       sp=findViewById(R.id.spinner);
        str=getResources().getStringArray(R.array.APP);
        ArrayAdapter<String>arrayAdapter;


        arrayAdapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,str);
        sp.setAdapter(arrayAdapter);

              sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                   @Override
                   public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                       String item= (String) sp.getItemAtPosition(position);
                       // Toast.makeText(MainActivity.this, ""+position, Toast.LENGTH_SHORT).show();
                       if(position==0)
                       {
                           Toast.makeText(MainActivity.this, "plz select any app", Toast.LENGTH_SHORT).show();
                       }
                       else if (position==1)
                       {
                           PackageManager pm= getPackageManager();
                           Intent i=pm.getLaunchIntentForPackage("com.instagram.android");
                           startActivity(i);
                       }
                       else if (position==2)
                       {
                           PackageManager pm= getPackageManager();
                           Intent i=pm.getLaunchIntentForPackage("com.whatsapp");
                           startActivity(i);
                       }
                       else if (position==3)
                       {
                           PackageManager pm= getPackageManager();
                           Intent i=pm.getLaunchIntentForPackage("com.android.vending");
                           startActivity(i);
                       }
                       else if (position==4)
                       {
                           Intent i=new Intent(Intent.ACTION_VIEW, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                           startActivity(i);
                       }
                   }

                   @Override
                   public void onNothingSelected(AdapterView<?> parent) {

                   }
               });

           }



}

