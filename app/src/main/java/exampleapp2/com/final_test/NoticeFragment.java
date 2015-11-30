package exampleapp2.com.final_test;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


public class NoticeFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View mainView = (View) inflater.inflate(R.layout.fragment_notice, container, false);

        WebView myWebView = (WebView) mainView.findViewById(R.id.noticeWebView);

        WebSettings webSettings = myWebView.getSettings();

        webSettings.setJavaScriptEnabled(true);



        myWebView.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(mainView.getContext(), "Oh no! " + description, Toast.LENGTH_SHORT).show();
            }
        });

        myWebView.loadUrl("http://mmmut.ac.in/AllNotice.aspx");

        return mainView;
    }




}
