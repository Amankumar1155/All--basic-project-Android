package com.gm.searchusingwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class loadingActivity extends AppCompatActivity {

    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        wv = findViewById(R.id.webView);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new WebViewClient());

        Bundle b = getIntent().getExtras();
        String Url = b.getString("url_key");
        wv.loadUrl(Url);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        wv.goBack();
    }
}