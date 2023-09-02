package com.kartik.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webView);

        //hide Status bar
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        //hide Toolbar
        getSupportActionBar().hide();

        webView.getSettings().setJavaScriptEnabled(true); // can access the javaScript

        webView.setWebViewClient(new WebViewClient()); //can load the multiple url

        webView.loadUrl("https://www.youtube.com/"); // load the url

    }
}