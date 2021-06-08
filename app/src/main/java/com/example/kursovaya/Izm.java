package com.example.kursovaya;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Izm extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.izm);
        ImageButton back = (ImageButton)findViewById(R.id.dann3);
        ImageButton change = (ImageButton)findViewById(R.id.dann4);
        EditText nazv, vozd, voda, poch;
        nazv = (EditText)findViewById(R.id.nazvReg);
        vozd = (EditText)findViewById(R.id.sostVozd);
        voda = (EditText)findViewById(R.id.sostVod);
        poch = (EditText)findViewById(R.id.sostPoch);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back.setImageResource(R.drawable.knopkaser_nazh);
                new CountDownTimer(300, 1000) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        back.setImageResource(R.drawable.knopkaser);
                        Intent i = new Intent(Izm.this, Menu.class);
                        startActivity(i);
                    }
                }.start();
            }
        });

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change.setImageResource(R.drawable.knopkaser_nazh);
                new CountDownTimer(300, 1000) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        change.setImageResource(R.drawable.knopkaser);



                        if(((vozd.getText().toString()=="0")||(vozd.getText().toString()=="1")||(vozd.getText().toString()=="2"))&&((voda.getText().toString()=="0")||(voda.getText().toString()=="1")||(voda.getText().toString()=="2"))&&((poch.getText().toString()=="0")||(poch.getText().toString()=="1")||(poch.getText().toString()=="2"))) {
                            switch (nazv.getText().toString()) {
                                case ("Центральный"):
                                    Sost.set(0,0,Integer.parseInt (vozd.toString().trim ()));
                                    Sost.set(0,1,Integer.parseInt (voda.toString().trim ()));
                                    Sost.set(0,2,Integer.parseInt (poch.toString().trim ()));
                                    break;
                                case ("Северо-Западный"):
                                    Sost.set(1,0,Integer.parseInt (vozd.toString().trim ()));
                                    Sost.set(1,1,Integer.parseInt (voda.toString().trim ()));
                                    Sost.set(1,2,Integer.parseInt (poch.toString().trim ()));
                                    break;
                                case ("Южный"):
                                    Sost.set(2,0,Integer.parseInt (vozd.toString().trim ()));
                                    Sost.set(2,1,Integer.parseInt (voda.toString().trim ()));
                                    Sost.set(2,2,Integer.parseInt (poch.toString().trim ()));
                                    break;
                                case ("Северо-Кавказский"):
                                    Sost.set(3,0,Integer.parseInt (vozd.toString().trim ()));
                                    Sost.set(3,1,Integer.parseInt (voda.toString().trim ()));
                                    Sost.set(3,2,Integer.parseInt (poch.toString().trim ()));
                                    break;
                                case ("Приволжский"):
                                    Sost.set(4,0,Integer.parseInt (vozd.toString().trim ()));
                                    Sost.set(4,1,Integer.parseInt (voda.toString().trim ()));
                                    Sost.set(4,2,Integer.parseInt (poch.toString().trim ()));
                                    break;
                                case ("Уральский"):
                                    Sost.set(5,0,Integer.parseInt (vozd.toString().trim ()));
                                    Sost.set(5,1,Integer.parseInt (voda.toString().trim ()));
                                    Sost.set(5,2,Integer.parseInt (poch.toString().trim ()));
                                    break;
                                case ("Сибирский"):
                                    Sost.set(6,0,Integer.parseInt (vozd.toString().trim ()));
                                    Sost.set(6,1,Integer.parseInt (voda.toString().trim ()));
                                    Sost.set(6,2,Integer.parseInt (poch.toString().trim ()));
                                    break;
                                case ("Дальневосточный"):
                                    Sost.set(7,0,Integer.parseInt (vozd.toString().trim ()));
                                    Sost.set(7,1,Integer.parseInt (voda.toString().trim ()));
                                    Sost.set(7,2,Integer.parseInt (poch.toString().trim ()));
                                    break;

                            }
                        }



                    }
                }.start();
            }
        });


    }
}