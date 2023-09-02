package com.kartik.datatransferfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kartik.datatransferfragment.auth.FirstFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.mainpage,new FirstFragment()).commit();
    }
}