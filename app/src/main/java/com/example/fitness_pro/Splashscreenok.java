package com.example.fitness_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splashscreenok extends AppCompatActivity {


    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreenok);


        ImageView imageView = findViewById(R.id.appsplash);
        Animation up = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.up);
        imageView.setAnimation(up);


        TextView textView = findViewById(R.id.appname);
        Animation down = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.down);
        imageView.setAnimation(down);
        int SPLASH_DISPLAY_LENGTH=3500;
        Handler handler = new Handler();

        Runnable run = new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splashscreenok.this,MainActivity.class));
                finish();
            }
        };
        handler.postDelayed(run,3500);

    }
}