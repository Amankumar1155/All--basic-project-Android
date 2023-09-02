package com.kartik.toggleandswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
ToggleButton tb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = findViewById(R.id.toggleButton); // finding the id of toggleButton
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b==true){
                    flashLight(b);
                    Toast.makeText(MainActivity.this, "Light On", Toast.LENGTH_SHORT).show();
                }
                else
                    flashLight(b);
                    Toast.makeText(MainActivity.this, "Light Off", Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void flashLight(boolean state)
    {
        try{

          CameraManager cm = (CameraManager) getSystemService(CAMERA_SERVICE);
          String cameraId = cm.getCameraIdList()[0];//0 here the flsh light ID
          cm.setTorchMode(cameraId,state);

        }
        catch (Exception e){

        }
    }
}