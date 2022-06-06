package com.example.kursovaya;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Sevk extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sevk);
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
                        Intent i = new Intent(Sevk.this, Menu.class);
                        startActivity(i);
                    }
                }.start();
            }
        });

        TextView vozd,voda,poch;
        vozd = (TextView)findViewById(R.id.textView30);
        voda = (TextView)findViewById(R.id.textView32);
        poch = (TextView)findViewById(R.id.textView34);
        vozd.setText(Sost.get(3,0));
        voda.setText(Sost.get(3,1));
        poch.setText(Sost.get(3,2));
    }
}