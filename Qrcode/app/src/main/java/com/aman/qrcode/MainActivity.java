package com.aman.qrcode;

//package com.ainwikinfotech.qrcodes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;

public class MainActivity extends AppCompatActivity
{

    SurfaceView surfaceView;
    TextView textView;
    Button btn;

    BarcodeDetector barcodeDetector;
    CameraSource cameraSource;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        surfaceView=findViewById(R.id.surfaceView);
        textView=findViewById(R.id.textView);
        btn=findViewById(R.id.button);

        barcodeDetector=new BarcodeDetector.Builder(this)
                .setBarcodeFormats(Barcode.ALL_FORMATS)
                .build();


        cameraSource=new CameraSource.Builder(this,barcodeDetector)
                .setRequestedPreviewSize(1920,1024)
                .build();


        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder holder)
            {

                try
                {

                    if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CAMERA)== PackageManager.PERMISSION_GRANTED)
                    {
                        cameraSource.start(surfaceView.getHolder());

                    }
                    else
                    {
                        ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.CAMERA},0);
                    }
                }
                catch (Exception e)
                {}



            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height)
            {
                Toast.makeText(MainActivity.this, "Surface changed..", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder holder)
            {
                cameraSource.stop();
            }
        });

        barcodeDetector.setProcessor(new Detector.Processor<Barcode>() {
            @Override
            public void release()
            {

            }

            @Override
            public void receiveDetections(Detector.Detections<Barcode> detections)
            {

                SparseArray<Barcode> data= detections.getDetectedItems();

                if (data.size()!=0)
                {

                    textView.post(new Runnable() {
                        @Override
                        public void run()
                        {
                            String value=data.valueAt(0).displayValue;
                            textView.setText(value);

                        }
                    });



                }


            }
        });

    }


    @Override
    protected void onPause()
    {
        super.onPause();
        cameraSource.release();
    }
}