package com.example.espressointent;

import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    static final String EMAIL_SUBJECT = "Test Subject";
    static final String EMAIL_BODY = "Test body";
    static final String PACKAGE_ID = "com.google.android.gm";

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
}