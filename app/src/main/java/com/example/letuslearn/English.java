package com.example.letuslearn;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class English extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    public void alphas(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.alphabet);
        mediaPlayer.start();
    }

    public void pause(View view){
        mediaPlayer.pause();
    }

    public void stop(View view){
        mediaPlayer.stop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
    }
}