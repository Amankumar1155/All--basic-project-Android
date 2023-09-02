package com.kartik.dailogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//Alert Dialog Box
public class MainActivity extends AppCompatActivity {
Button b1;
AlertDialog.Builder ab; // AlertDailog is the Outer Class and Builder is the Inner Class
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              ab = new AlertDialog.Builder(MainActivity.this);
              ab.setTitle("Nikal Pehli Pursat Me");
              ab.setIcon(R.drawable.ic_baseline_warning_24);
              ab.setCancelable(false);
              ab.setMessage("Bahar Niaklna Chahata Hai ?");
              ab.setPositiveButton("Ha", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialogInterface, int i)
                  {

                  }
              });
              ab.setNegativeButton("Nahi", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialogInterface, int i)
                  {
                      dialogInterface.dismiss();
                  }
              });
              ab.setNeutralButton("Kuch Bhi", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialogInterface, int i) {
                      finish(); // to terminate the Activity
                  }
              });
              ab.show();


            }
        });
    }
}