package com.example.beachplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {

    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        music = MediaPlayer.create(MainActivity.this, R.raw.introsound);
        music.start();
        setTheme(R.style.Theme_BeachPlease);
        setContentView(R.layout.activity_main);
    }
}