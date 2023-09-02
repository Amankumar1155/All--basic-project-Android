package com.aman.progressdialogbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressDialog pd = new ProgressDialog(MainActivity.this);

                pd.setMessage("kripya intejaar karte rhe");
                pd.setCanceledOnTouchOutside(false);
                pd.setTitle("Movie");
               // pd.setMessage("wait");
                pd.show();
            }
        });
    }
}