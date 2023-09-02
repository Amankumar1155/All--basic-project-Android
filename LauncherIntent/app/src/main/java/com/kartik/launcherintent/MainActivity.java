package com.kartik.launcherintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Internal App
                //camera
              /*  Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(i);*/
                //Contacts
               /* Intent i = new Intent(Intent.ACTION_VIEW, ContactsContract.Contacts.CONTENT_URI);
                startActivity(i);*/

                //Gallery
                /*Intent i = new Intent(Intent.ACTION_VIEW, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivity(i);*/

                //File Manager
              /*  Intent i = new Intent();
                i.setType("pdf/*");
                i.setAction(Intent.ACTION_GET_CONTENT);
                startActivity(i);*/

                //Browser
              /*  Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=R8j_VkQgA1o"));
                startActivity(i);*/

                //settings
                Intent i = new Intent(Settings.ACTION_SETTINGS);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              PackageManager pm = getPackageManager(); // pacakgeManager control all the commands
               Intent i= pm.getLaunchIntentForPackage("com.android.vending");
               Intent j= pm.getLaunchIntentForPackage("com.whatsapp");
                startActivity(i);
                startActivity(j);

            }
        });
    }
}