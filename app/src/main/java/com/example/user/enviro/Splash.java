package com.example.user.enviro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread th=new Thread() {
            public void run() {
                try {
                    sleep(1000);
                } catch (Exception e) {
                } finally {
                    Intent i = new Intent(Splash.this, description.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        th.start();
    }
}
