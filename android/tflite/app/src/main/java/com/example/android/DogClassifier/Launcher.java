package com.example.android.DogClassifier;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

import hotchemi.android.rate.AppRate;

public class Launcher extends Activity{

    private static final String LOG_TAG = Launcher.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher);



        Intent intent = new Intent(Launcher.this, CameraActivity.class);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Do something after 5s = 5000ms
                startActivity(intent);
            }
        }, 5000);

    }
}
