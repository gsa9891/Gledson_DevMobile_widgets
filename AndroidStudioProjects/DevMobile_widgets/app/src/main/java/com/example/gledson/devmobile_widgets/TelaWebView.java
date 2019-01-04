package com.example.gledson.devmobile_widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TelaWebView extends AppCompatActivity {

    private WebView webView_exemplo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_web_view);

        webView_exemplo = (WebView)findViewById(R.id.webVie_exemplo);
        webView_exemplo.setWebViewClient(new WebViewClient());
        webView_exemplo.loadUrl("https://g1.globo.com");
    }
}
