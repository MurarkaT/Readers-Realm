package com.example.readersrealm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class IntroductoryActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN=5000;
    ImageView logo,image;
    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory);

        logo=findViewById(R.id.logo);
        image=findViewById(R.id.image);
        lottieAnimationView=findViewById(R.id.lottie);

        image.animate().translationY(-2400).setDuration(1000).setStartDelay(4000);
        logo.animate().translationY(2000).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1500).setDuration(1000).setStartDelay(4000);

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent intent=new Intent(IntroductoryActivity.this,employer_login.class);
               startActivity(intent);
               finish();
           }
       },SPLASH_SCREEN);
    }
}