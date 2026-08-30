package com.aasha.master.app

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webView = WebView(this)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.settings.allowFileAccess = false
        webView.webViewClient = WebViewClient()

        // AASHA GitHub Pages website
        webView.loadUrl("https://surajmishr999-coder.github.io/aasha-android/")
        setContentView(webView)
    }
}
