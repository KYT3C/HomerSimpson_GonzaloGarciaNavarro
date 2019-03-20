package com.example.homersimpson_gonzalogarcianavarro;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Animación Título TheSimpson-----------------------------------------
        ImageView imageView = findViewById(R.id.imageTheSimpsonTitle);
        imageView.setBackgroundResource(R.drawable.animation_list_thesimpson);
        animationDrawable = (AnimationDrawable) imageView.getBackground();
        animationDrawable.start();
        //--------------------------------------------------------------------
    }
}
