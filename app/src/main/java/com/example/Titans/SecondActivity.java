package com.example.Titans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.Titans.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        WebView textView = findViewById(R.id.textView);
        textView.loadUrl("file:///android_asset/" + getIntent().getStringExtra("key"));
    }
}