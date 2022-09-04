package com.example.letuslearn;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

public class audioStory extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    public void golden(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.goldernbird);
        mediaPlayer.start();
    }

    public void lion(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.lionandmouse);
        mediaPlayer.start();
    }

    public void sleepybear(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.lionmouseandsleepybear);
        mediaPlayer.start();
    }

    public void onetwothree(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.oneeyetwoeyethreeeye);
        mediaPlayer.start();
    }

    public void sweet(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.sweetporridgestory);
        mediaPlayer.start();
    }

    public void farmer(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.thefarmerprincess);
        mediaPlayer.start();
    }

    public void stop(View view){
        mediaPlayer.stop();
    }

    public void pause(View view){
        mediaPlayer.pause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_story);
    }
}