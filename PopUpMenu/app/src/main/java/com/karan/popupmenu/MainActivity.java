package com.karan.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.textView);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                PopupMenu p=new PopupMenu(MainActivity.this,t1);
                p.getMenuInflater().inflate(R.menu.popup_menu, p.getMenu());
                p.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem)
                    {
                        switch (menuItem.getTitle().toString())
                        {
                            case "Red":
                                t1.setTextColor(Color.parseColor("#F44336"));
                                break;
                            case "Yellow":
                                t1.setTextColor(Color.parseColor("#FFEB3B"));
                                break;
                            case "Green":
                                t1.setTextColor(Color.parseColor("#4CAF50"));
                                break;
                        }
                        return false;
                    }
                });
                p.show();
            }
        });
    }
}