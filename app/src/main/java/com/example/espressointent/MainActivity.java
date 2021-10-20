package com.example.espressointent;

import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    static final String EMAIL_SUBJECT = "Test Subject";
    static final String EMAIL_BODY = "Test body";
    static final String PACKAGE_ID = "com.google.android.gm";
    static final String URL ="https://github.com/bgangu/EspressoIntent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionEmail(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto","testaccount@gmail.com", null));
        intent.putExtra(Intent.EXTRA_SUBJECT, EMAIL_SUBJECT);
        intent.putExtra(Intent.EXTRA_TEXT, EMAIL_BODY);
        intent.putExtra(Intent.EXTRA_PACKAGE_NAME, PACKAGE_ID);
        startActivity(intent);
    }

//    public void updateURL(View view){
//        Bundle bundle = getURL().getExtras();
//        String url = bundle.getString(Intent.EXTRA_TEXT);
//        TextView textView = (TextView) findViewById(R.id.textView);
//        textView.setText(url);
//    }
//
//    public Intent getURL(){
//        Intent shareIntent = new Intent(Intent.ACTION_SEND);
//        shareIntent.setType("text/plain");
//        shareIntent.putExtra(Intent.EXTRA_TEXT, URL);
//        return shareIntent;
//    }
}