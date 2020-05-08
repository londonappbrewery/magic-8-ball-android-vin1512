package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballPicture = (ImageView) findViewById(R.id.image_8ball);
        Button clickButton = (Button) findViewById(R.id.askButton);

        //Storing images in array
        final int[] picArray = new int[] {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Test","SUCCESS!!!!");

                Random randomNumber = new Random();
                int selector = randomNumber.nextInt(5);

                ballPicture.setImageResource(picArray[selector]);
                
            }
        });




    }
}
