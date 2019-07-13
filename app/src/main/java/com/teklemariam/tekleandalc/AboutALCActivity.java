package com.teklemariam.tekleandalc;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class AboutALCActivity extends AppCompatActivity {
    private String url = "https://www.google.com/";
    private WebView webView;
    //    private WebView alcWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        webView = new WebView(this);
        setContentView(webView);
        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl(url);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


        class WebAppInterface {
            Context mContext;

            WebAppInterface(Context c) {
                mContext = c;
            }

            @JavascriptInterface
            public void showToast(String toast) {
                Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
            }
        }
        webView.addJavascriptInterface(new WebAppInterface(this), "Android");
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
