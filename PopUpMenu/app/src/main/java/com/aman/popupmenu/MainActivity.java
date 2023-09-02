package com.aman.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.textView);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu p = new PopupMenu(MainActivity.this,txt);
                p.getMenuInflater().inflate(R.menu.popmenu,p.getMenu());
                p.show();
                p.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.item:
                                txt.setTextColor(Color.RED);
                                break;
                            case R.id.item1:
                                txt.setTextColor(Color.GREEN);
                                break;
                            case R.id.item2:
                                txt.setTextColor(Color.BLUE);
                                break;
                        }

                        return false;
                    }
                });




            }
        });



    }
}