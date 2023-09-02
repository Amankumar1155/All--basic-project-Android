package com.karan.activitylifecycle;


import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity


    {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
           // Toast.makeText(this, "onCreate Running", Toast.LENGTH_LONG).show();
            Log.d("xyz","onCreate Running");

        }


        @Override
        protected void onStart() {
            super.onStart();
           // Toast.makeText(this, "onStart Running", Toast.LENGTH_SHORT).show();
            Log.d("xyz","onStart Running");
        }

        @Override
        protected void onPause() {
            super.onPause();
            //Toast.makeText(this, "onPause Running", Toast.LENGTH_SHORT).show();
            Log.d("xyz","onPause Running")
        }

        @Override
        protected void onPostResume() {
            super.onPostResume();
            //Toast.makeText(this, "onPostResume Running", Toast.LENGTH_SHORT).show();
            Log.d("xyz","onPostResume Running");
        }

        @Override
        protected void onRestart() {
            super.onRestart();
            //Toast.makeText(this, "onRestart Running", Toast.LENGTH_SHORT).show();
            Log.d("xyz","onRestart Running");
        }

        @Override
        protected void onStop() {
            super.onStop();
            //Toast.makeText(this, "onStop Running", Toast.LENGTH_SHORT).show();
            Log.d("xyz","onSTop Running");
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            //Toast.makeText(this, "onDestroy Running", Toast.LENGTH_SHORT).show();
            Log.d("xyz","onDestroy Running");
        }
    }
