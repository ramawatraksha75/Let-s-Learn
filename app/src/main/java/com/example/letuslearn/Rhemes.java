package com.example.letuslearn;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Rhemes extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    public void bingo(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.bingo);
        mediaPlayer.start();

    }

    public void atoz(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.dreamatoz);
        mediaPlayer.start();

    }

    public void spider(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.eencyweencyspider);
        mediaPlayer.start();

    }

    public void littleMonkey(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.littlemonkey);
        mediaPlayer.start();

    }

    public void london(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.london);
        mediaPlayer.start();

    }

    public void oldmacdonald(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.oldmacdonald);
        mediaPlayer.start();

    }

    public void twinkle(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.twinkle);
        mediaPlayer.start();
    }

    public void wheelsonbus(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.wheelsonbusgo);
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
        setContentView(R.layout.activity_rhemes);
    }
}