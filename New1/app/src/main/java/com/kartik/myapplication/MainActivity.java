package com.kartik.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Toast.makeText(this, "On Create Running", Toast.LENGTH_SHORT).show();
        Log.d("Martin", "On Create Runnig");
    }

    @Override
    protected void onStart() {
        super.onStart();
       // Toast.makeText(this, "On Start Runnig", Toast.LENGTH_SHORT).show();
        Log.d("Martin", "On Start Running");
    }

    @Override
    protected void onPause() {
        super.onPause();
       // Toast.makeText(this, "On Pause Running", Toast.LENGTH_SHORT).show();
        Log.d("Martin", "On Pause Running");
    }


    @Override
    protected void onPostResume() {
        super.onPostResume();
       // Toast.makeText(this, "On Post Runnig", Toast.LENGTH_SHORT).show();
        Log.d("Martin", "On Post Resume Running");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //Toast.makeText(this, "On Restart Runnig", Toast.LENGTH_SHORT).show();
        Log.d("Martin ", "On Restart Running");
    }

    @Override
    protected void onStop() {
        super.onStop();
       // Toast.makeText(this, "On Stop Running", Toast.LENGTH_SHORT).show();
        Log.d("Martin", "On Stop Running");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
       // Toast.makeText(this, "On Destroy Running", Toast.LENGTH_SHORT).show();
        Log.d("Martin", "On Destroy Running");
    }
}