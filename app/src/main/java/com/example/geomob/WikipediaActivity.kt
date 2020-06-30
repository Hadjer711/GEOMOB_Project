package com.example.geomob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class WikipediaActivity : AppCompatActivity() {

    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wikipedia)

        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.loadUrl(getIntent().getStringExtra("wikipedia"))

    }
}
