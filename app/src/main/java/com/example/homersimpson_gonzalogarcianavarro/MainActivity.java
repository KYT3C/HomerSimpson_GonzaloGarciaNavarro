package com.example.homersimpson_gonzalogarcianavarro;


import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    //AnimationList
    AnimationDrawable animationDrawable;
    //ImageViewImagenesAparecen
    ImageView imageViewTheSimpson,imageViewDonut,imageViewERojo,imageViewEAzul,imageViewEVerde,imageViewOjo;
    //MediaPlayer
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Animación Título TheSimpson-----------------------------------------
        imageViewTheSimpson = findViewById(R.id.imageTheSimpsonTitle);
        imageViewTheSimpson.setBackgroundResource(R.drawable.animation_list_thesimpson);
        animationDrawable = (AnimationDrawable) imageViewTheSimpson.getBackground();
        animationDrawable.start();
        //--------------------------------------------------------------------
        //ImageViewImagenesAparecen
        imageViewDonut = findViewById(R.id.imageViewDonut);
        imageViewDonut.setVisibility(View.INVISIBLE);

        imageViewERojo = findViewById(R.id.imageViewRojo);
        imageViewERojo.setVisibility(View.INVISIBLE);

        imageViewEAzul = findViewById(R.id.imageViewAzul);
        imageViewEAzul.setVisibility(View.INVISIBLE);

        imageViewEVerde = findViewById(R.id.imageViewVerde);
        imageViewEVerde.setVisibility(View.INVISIBLE);

        imageViewOjo = findViewById(R.id.imageViewOjo);
        imageViewOjo.setVisibility(View.INVISIBLE);
        //---------------------------------------------------------------------
        //On Click Listener de título TheSimpson
        imageViewTheSimpson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    imageViewDonut.setVisibility(View.VISIBLE);
                    imageViewERojo.setVisibility(View.VISIBLE);
                    imageViewEAzul.setVisibility(View.VISIBLE);
                    imageViewEVerde.setVisibility(View.VISIBLE);
            }
        });
    }

    public void playSimpsonSong(View v) {
        player = MediaPlayer.create(this, R.raw.the_simpsons);
        if (player.isPlaying()) {
            player.pause();
        }else {player = MediaPlayer.create(this, R.raw.the_simpsons);player.start();}
    }
}
