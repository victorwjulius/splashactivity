package com.winnie.webappwithsplashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView page1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        page1 = findViewById(R.id.web);
        WebSettings settings = page1.getSettings();
        settings.setJavaScriptEnabled(true);
        page1.loadUrl("https://www.emobilis.ac.ke");
    }
}
