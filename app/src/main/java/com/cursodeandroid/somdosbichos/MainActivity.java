package com.cursodeandroid.somdosbichos;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;

public class MainActivity extends Activity implements View.OnClickListener {

    private ImageView cao;
    private ImageView gato;
    private ImageView ovelha;
    private ImageView leao;
    private ImageView macaco;
    private ImageView vaca;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cao = findViewById(R.id.caoid);
        gato = findViewById(R.id.gatoid);
        ovelha = findViewById(R.id.ovelhaid);
        leao = findViewById(R.id.leaoid);
        macaco = findViewById(R.id.macacoid);
        vaca = findViewById(R.id.vacaid);

        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        leao.setOnClickListener(this);
        macaco.setOnClickListener(this);
        vaca.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
    switch (v.getId()){
        case R.id.caoid:
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.cao);
            tocarSom();
            break;

        case R.id.gatoid:
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.gato);
            tocarSom();
            break;
        case R.id.ovelhaid:
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ovelha);
            tocarSom();
            break;
        case R.id.leaoid:
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.leao);
            tocarSom();
            break;
        case R.id.macacoid:
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.macaco);
            tocarSom();
            break;
        case R.id.vacaid:
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.vaca);
            tocarSom();
            break;
    }
    }
    public void tocarSom(){
        if( mediaPlayer != null ){
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.release();
                }
            });
        }}


    @Override
    protected void onDestroy() {
        if (mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }

        super.onDestroy();

    }

}

