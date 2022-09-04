package com.example.letuslearn;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tables extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    public void twotw(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.twototwele);
        mediaPlayer.start();

    }

    public void two(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.twotable);
        mediaPlayer.start();
    }

    public void three(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.threetable);
        mediaPlayer.start();
    }

    public void four(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.fourtable);
        mediaPlayer.start();
    }

    public void five(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.fivetable);
        mediaPlayer.start();
    }

    public void six(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.sixtable);
        mediaPlayer.start();
    }

    public void seven(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.seventable);
        mediaPlayer.start();
    }

    public void eight(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.eighttable);
        mediaPlayer.start();
    }

    public void nine(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.ninetable);
        mediaPlayer.start();
    }

    public void ten(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.tentable);
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
        setContentView(R.layout.activity_tables);
    }
}