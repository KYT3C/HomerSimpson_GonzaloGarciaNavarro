package com.example.homersimpson_gonzalogarcianavarro;


import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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
        player = MediaPlayer.create(this, R.raw.the_simpsons);
    }

    public void clockwise(View view){
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise);
        view.startAnimation(animation);
    }

    public void clockwise2(View view){
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise2);
        view.startAnimation(animation);
    }

    public void clockwise3(View view){
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise3);
        view.startAnimation(animation);
    }

    public void slide(View view){
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide);
        view.startAnimation(animation);
    }

    public void playSimpsonSong(View v) {
        if (player.isPlaying()) {
            player.pause();
        }else {
            player.start();
        }
    }


    public void aparecer(View view) {
        if(imageViewEVerde.getVisibility() == View.VISIBLE) {
            imageViewDonut.setVisibility(View.INVISIBLE);
            imageViewDonut.clearAnimation();

            imageViewERojo.setVisibility(View.INVISIBLE);
            imageViewERojo.clearAnimation();

            imageViewEAzul.setVisibility(View.INVISIBLE);
            imageViewEAzul.clearAnimation();

            imageViewEVerde.setVisibility(View.INVISIBLE);
            imageViewEVerde.clearAnimation();

            imageViewOjo.setVisibility(View.INVISIBLE);
            imageViewOjo.clearAnimation();

        }else{
            imageViewDonut.setVisibility(View.VISIBLE);
            slide(imageViewDonut);

            imageViewERojo.setVisibility(View.VISIBLE);
            clockwise(imageViewERojo);

            imageViewEAzul.setVisibility(View.VISIBLE);
            clockwise(imageViewEAzul);

            imageViewEVerde.setVisibility(View.VISIBLE);
            clockwise2(imageViewEVerde);

            imageViewOjo.setVisibility(View.VISIBLE);
            clockwise3(imageViewOjo);
        }
    }
}
