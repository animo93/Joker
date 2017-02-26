package com.example.animo.jokeactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_joke);
        String joke=getIntent().getStringExtra("joke");
        TextView textView= (TextView) findViewById(R.id.joke);
        textView.setText(joke);
    }
}
