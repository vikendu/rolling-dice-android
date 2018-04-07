package com.vikendu.rolling;

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

        Button roll_button = (Button)findViewById(R.id.button);
        final ImageView left_d = (ImageView) findViewById(R.id.left_die);
        final ImageView right_d = (ImageView) findViewById(R.id.right_die);

        final int[] dice_arr = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };
        roll_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Log.d("rolling","poop");
                Random rand =  new Random();
                int var_no = rand.nextInt(6);

                left_d.setImageResource(dice_arr[var_no]);
                int new_rand = rand.nextInt(6);
                right_d.setImageResource(dice_arr[new_rand]);
                //Log.d("poop",Integer.toString(var_no));

            }
        });
    }
}
