package sdj.com.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class MainActivity extends ActionBarActivity {

    /**CONSTANTS**/

    private static final String TAG = MainActivity.class.getCanonicalName();

    /**MEMBERS**/

    private WebView mWebView;
    private ProgressBar mLoading;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWebView = (WebView)findViewById(R.id.wvPortal);

        mWebView.loadUrl("file:///index.html");

        WebSettings mWebSettings = mWebView.getSettings();

        mWebSettings.setJavaScriptEnabled(true);

    }

}