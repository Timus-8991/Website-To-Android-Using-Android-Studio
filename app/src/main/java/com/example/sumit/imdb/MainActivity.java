package com.example.sumit.imdb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mWebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebview = (WebView) findViewById(R.id.web_view);
         WebSettings webSettings = mWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(false);
         mWebview.loadUrl("http://www.imdb.com/");
        mWebview.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(mWebview.canGoBack())
        {
            mWebview.goBack();
        }else
        super.onBackPressed();
    }
}
