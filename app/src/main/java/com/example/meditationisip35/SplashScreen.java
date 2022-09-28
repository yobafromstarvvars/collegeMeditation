package com.example.meditationisip35;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_SCREEN = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow();
        setContentView(R.layout.activity_splash_screen);

        Runnable runable = new Runnable () {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };

        new Handler().postDelayed(runable, SPLASH_SCREEN);
    }
}