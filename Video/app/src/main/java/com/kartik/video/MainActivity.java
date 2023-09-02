package com.kartik.video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    video = findViewById(R.id.videoView);

     video.setMediaController(new MediaController(this));

     video.setVideoURI(Uri.parse("android.resource://"+getPackageName() + "/"+ R.raw.video));
     video.start();
    }
}
