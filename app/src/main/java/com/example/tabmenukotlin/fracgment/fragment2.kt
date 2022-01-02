package com.example.tabmenukotlin.fracgment

import android.os.Bundle
import android.view.*
import android.webkit.WebView
import androidx.fragment.app.Fragment
import android.webkit.WebViewClient
import com.example.tabmenukotlin.R
import kotlinx.android.synthetic.main.fragment_fragment2.*

class fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /** Inflate the layout for this fragment */
      return  inflater.inflate(R.layout.fragment_fragment2, container, false)}
//
//        webview.loadUrl("https://eservices.tn.gov.in/eservicesnew/land/chittaNewRuralTamil.html?lan=ta")
//
//        val webSettings = webview.settings
//        webSettings.javaScriptEnabled = true
//        webview.webViewClient = WebViewClient()
//
//        webview.canGoBack()
//        webview.setOnKeyListener(View.OnKeyListener() { v, keycode, event ->
//            if (keycode == KeyEvent.KEYCODE_BACK
//                && event.action == MotionEvent.ACTION_UP
//                && webview.canGoBack()){
//                webview.goBack()
//                return@OnKeyListener true
//            }
//            false
//
//
//
//
//        })

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val myWebView: WebView = view.findViewById(R.id.webView)
        myWebView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url: String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }

        myWebView.loadUrl("https://eservices.tn.gov.in/eservicesnew/land/chittaCheckNewRural_en.html?lan=en")
        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.allowContentAccess = true
        myWebView.settings.domStorageEnabled = true
        myWebView.settings.useWideViewPort = true


    }




}


