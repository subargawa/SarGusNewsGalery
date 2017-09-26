package com.example.gustut.sargusphotogalery.activity.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.gustut.sargusphotogalery.R;

public class MainActivity extends AppCompatActivity {

    public static int SPLASH_TIME_OUT=2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("SarGus Development");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mintent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(mintent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
