package com.ashlands.game;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.graphics.Color;

public class MainActivity extends Activity {
  @Override public void onCreate(Bundle b){ super.onCreate(b); getWindow().setStatusBarColor(Color.BLACK); getWindow().setNavigationBarColor(Color.BLACK);
    WebView w=new WebView(this); w.setBackgroundColor(Color.rgb(18,22,28)); w.setWebViewClient(new WebViewClient());
    WebSettings s=w.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setAllowFileAccess(true); s.setAllowContentAccess(true);
    w.loadUrl("file:///android_asset/index.html"); setContentView(w);
  }
}
