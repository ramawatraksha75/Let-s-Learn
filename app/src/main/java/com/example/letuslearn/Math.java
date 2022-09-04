package com.example.letuslearn;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Math extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    public  void number(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.numbercount);
        mediaPlayer.start();
    }

    public void pause(View view){
        mediaPlayer.pause();
    }

    public void stop(View view){
        mediaPlayer.stop();
    }

    public void tables(View view){
        Intent intent =new Intent(Math.this,tables.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
    }
}