package com.aman.video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view=findViewById(R.id.videoView);
        view.setMediaController(new MediaController(this));
        view.setVideoURI(Uri.parse("android.resource://" +getPackageName()+"/"+R.raw.vvv));
        view.start();
    }
}