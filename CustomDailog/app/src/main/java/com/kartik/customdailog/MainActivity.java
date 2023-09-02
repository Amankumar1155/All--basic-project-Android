package com.kartik.customdailog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       t1 = findViewById(R.id.textView);
       t1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Dialog d = new Dialog(MainActivity.this);

               d.setContentView(R.layout.custom_layout);
               d.setCanceledOnTouchOutside(false);
               d.show();

               RatingBar r = d.findViewById(R.id.ratingbar);
               Button b = d.findViewById(R.id.button);

               b.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       double star =  r.getRating();
                       Toast.makeText(MainActivity.this, "Star"+star, Toast.LENGTH_SHORT).show();
                        d.dismiss();
                   }
               });
           }
       });
    }


}