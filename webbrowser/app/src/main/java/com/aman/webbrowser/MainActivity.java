package com.aman.webbrowser;

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

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        webView.getSettings().setJavaScriptEnabled(true); // can access the javaScript

        webView.getSettings().setAllowContentAccess(true);


        webView.setWebViewClient(new WebViewClient()); // can load the multiple url

        webView.loadUrl("https://github.com/Amankumar1155"); // load the url



    }

    @Override
    public void onBackPressed()
    {
        if(webView!=null) {
            webView.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
