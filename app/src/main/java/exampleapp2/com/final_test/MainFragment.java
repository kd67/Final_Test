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
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

       final View mainView = (View) inflater.inflate(R.layout.fragment_main2, container, false);

        WebView myWebView = (WebView) mainView.findViewById(R.id.mainWebView);

        WebSettings webSettings = myWebView.getSettings();

        webSettings.setJavaScriptEnabled(true);



        myWebView.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(mainView.getContext(), "Oh no! " + description, Toast.LENGTH_SHORT).show();
            }
        });

        myWebView.loadUrl("http://www.mmmut.ac.in");

        return mainView;
    }

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//
//       // getActivity().getWindow().requestFeature(Window.FEATURE_PROGRESS);
//        super.onCreate(savedInstanceState);
//
//
//
////        final Activity activity = getActivity();
////

//
//
//    }
}
