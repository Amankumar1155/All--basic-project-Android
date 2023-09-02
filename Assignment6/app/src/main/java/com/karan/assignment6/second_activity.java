package com.karan.assignment6;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class second_activity extends AppCompatActivity {
    ImageButton ib1,ib2;
    ImageView imageView;
    Bitmap bmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageView=findViewById(R.id.imageview);
        ib1=findViewById(R.id.imageButton);
        ib2=findViewById(R.id.imageButton2);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,0);
                try {
                    getApplicationContext().setWallpaper(bmp);
                }
                catch (Exception e)
                {

                }
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {
        if (requestCode==101 && resultCode==RESULT_OK && data!=null)
        {
            Bundle b=data.getExtras();
            bmp= (Bitmap) b.get("data");
            imageView.setImageBitmap(bmp);
        }
        else
        {
            Toast.makeText(this, "Please Select Image", Toast.LENGTH_SHORT).show();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}