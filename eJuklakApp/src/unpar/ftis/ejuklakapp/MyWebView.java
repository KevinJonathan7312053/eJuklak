package unpar.ftis.ejuklakapp;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebView extends WebViewClient{

	 public boolean shouldOverrideUrlLoading(WebView view, String url) {
         view.loadUrl(url);
         return true;
     }
}
