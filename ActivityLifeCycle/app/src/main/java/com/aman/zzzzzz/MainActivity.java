package com.aman.zzzzzz;


import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
        @Override
        protected void onStart() {
            super.onStart();
            Toast.makeText(this, "Start", Toast.LENGTH_SHORT).show();
        }
        @Override
        protected void onResume() {
            super.onResume();
            Toast.makeText(this, "Resume", Toast.LENGTH_SHORT).show();
        }
        @Override
        protected void onPause() {
            super.onPause();
            Toast.makeText(this, "pause", Toast.LENGTH_SHORT).show();
        }
        @Override
        protected void onStop() {
            super.onStop();
            Toast.makeText(this, "stop", Toast.LENGTH_SHORT).show();
        }
        @Override
        protected void onRestart() {
            super.onRestart();
            Toast.makeText(this, "Restart", Toast.LENGTH_SHORT).show();
        }
        @Override
        protected void onDestroy() {
            super.onDestroy();
            Toast.makeText(this, "Destroy", Toast.LENGTH_SHORT).show();
        }
    }