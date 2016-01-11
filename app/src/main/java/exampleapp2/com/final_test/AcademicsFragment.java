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


/**
 * A simple {@link Fragment} subclass.
 */
public class AcademicsFragment extends Fragment {


    public AcademicsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      final View acadView = (View) inflater.inflate(R.layout.fragment_academics, container, false);

        WebView acadWebView = (WebView) acadView.findViewById(R.id.acadWebView);

        WebSettings webSettings = acadWebView.getSettings();

        webSettings.setJavaScriptEnabled(true);



        acadWebView.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(acadView.getContext(), "Oh no! " + description, Toast.LENGTH_SHORT).show();
            }
        });

        acadWebView.loadUrl("http://14.139.233.57/mmmut/studentlogin.aspx");


        return acadView;
    }

}
