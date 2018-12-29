package com.pgf.simpledaggermvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
* 1: add dagger and mockito dependencies
* 2: override Application class and declare in manifest
* */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
