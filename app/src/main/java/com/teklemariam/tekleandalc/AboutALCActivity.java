package com.teklemariam.tekleandalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALCActivity extends AppCompatActivity {
    private WebView alcWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
/** from codinginflow

        alcWebView = findViewById(R.id.webview_alc);
        alcWebView.setWebViewClient(new WebViewClient());
        alcWebView.loadUrl("https://andela.com/alc/");
//        alcWebView.loadUrl("https://www.google.com/");

        WebSettings webSettings = alcWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
*/
//        alcWebView = findViewById(R.id.webview_alc);
//        alcWebView.loadUrl("https://andela.com/alc/");
        WebView alcWebView = new WebView(this);
        setContentView(alcWebView);
        alcWebView.loadUrl("https://andela.com/alc/");
        WebSettings webSettings = alcWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    /**from codinginflow
     *  @Override
    public void onBackPressed() {
        if (alcWebView.canGoBack()) {
            alcWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }*/
}
