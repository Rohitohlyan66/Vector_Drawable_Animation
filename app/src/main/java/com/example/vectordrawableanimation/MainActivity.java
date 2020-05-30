package com.example.vectordrawableanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=findViewById(R.id.btn);
        ImageView imageView=findViewById(R.id.charging);
        imageView.setBackgroundResource(R.drawable.image_list);
        final AnimationDrawable animationDrawable;
        animationDrawable=(AnimationDrawable)imageView.getBackground();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationDrawable.start();
            }
        });


    }
}
