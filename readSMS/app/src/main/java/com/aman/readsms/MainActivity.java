package com.aman.readsms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text);
        //Run_time permission
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_SMS)!= PackageManager.PERMISSION_GRANTED);
        {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.READ_SMS},0);
            return;

        }
        Cursor c=getContentResolver().query(Uri.parse(Uri.parse(getString(R.string.)),null,null,null,null));
        if(c.moveToFirst())
        {
            do {
                String data,column_name;
                for (int i=0, i<c.getColumnCount();i++)
                {
                    cname=c.getColumnName(i);
                    if (cname.equal("address"))
                    {
                        data=cname+":-"+c.getString(i)+"\n\n";
                    }
                }
                textView.append(data)  ;
            }
            while (c.moveToFirst())
        }
    }
}