package com.example.gustut.sargusphotogalery.activity.activity;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.gustut.sargusphotogalery.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("SarGus Photos Gallery");


        SharedPreferences pref = getApplicationContext().getSharedPreferences("Option", MODE_PRIVATE);
        final SharedPreferences.Editor meditor = pref.edit();


    }
}
