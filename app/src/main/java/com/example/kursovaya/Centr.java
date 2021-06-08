package com.example.kursovaya;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Centr extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.centr);
        ImageButton back = (ImageButton)findViewById(R.id.dann3);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back.setImageResource(R.drawable.knopkaser_nazh);
                new CountDownTimer(300, 1000) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        back.setImageResource(R.drawable.knopkaser);
                        Intent i = new Intent(Centr.this, Menu.class);
                        startActivity(i);
                    }
                }.start();
            }
        });
    }
}