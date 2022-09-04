package com.example.letuslearn;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void eng(View view){

        Intent intent =new Intent(MainActivity.this ,English.class);
        startActivity(intent);
    }

    public void mat(View view){
        Intent intent =new Intent(MainActivity.this ,Math.class);
        startActivity(intent);
    }

    public void rheme(View view){
        Intent intent =new Intent(MainActivity.this ,Rhemes.class);
        startActivity(intent);
    }

    public void sto(View view){
        Intent intent =new Intent(MainActivity.this ,audioStory.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}