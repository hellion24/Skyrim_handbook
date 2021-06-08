package com.example.kursovaya;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        ImageButton centr, sevz, yuzh, sevk, priv, ural, sibir, daln, svyaz, dann;
        centr = (ImageButton)findViewById(R.id.centr);
        sevz = (ImageButton)findViewById(R.id.sevz);
        yuzh = (ImageButton)findViewById(R.id.yuzh);
        sevk = (ImageButton)findViewById(R.id.sevk);
        priv = (ImageButton)findViewById(R.id.priv);
        ural = (ImageButton)findViewById(R.id.ural);
        sibir = (ImageButton)findViewById(R.id.sibir);
        daln = (ImageButton)findViewById(R.id.dalv);
        svyaz = (ImageButton)findViewById(R.id.svyaz);
        dann = (ImageButton)findViewById(R.id.dann);


        svyaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svyaz.setImageResource(R.drawable.knopkaser_nazh);
                new CountDownTimer(300, 1000) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        svyaz.setImageResource(R.drawable.knopkaser);
                        Intent i = new Intent(Menu.this, Contacts.class);
                        startActivity(i);
                    }
                }.start();
            }
        });

        centr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                centr.setImageResource(R.drawable.knopkaser_nazh);
                new CountDownTimer(300, 1000) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        centr.setImageResource(R.drawable.knopkaser);
                        Intent i = new Intent(Menu.this, Centr.class);
                        startActivity(i);
                    }
                }.start();
            }
        });

        sevz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sevz.setImageResource(R.drawable.knopkaser_nazh);
                new CountDownTimer(300, 1000) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        sevz.setImageResource(R.drawable.knopkaser);
                        Intent i = new Intent(Menu.this, Sevz.class);
                        startActivity(i);
                    }
                }.start();
            }
        });

        sevk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sevk.setImageResource(R.drawable.knopkaser_nazh);
                new CountDownTimer(300, 1000) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        sevk.setImageResource(R.drawable.knopkaser);
                        Intent i = new Intent(Menu.this, Sevk.class);
                        startActivity(i);
                    }
                }.start();
            }
        });

        yuzh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yuzh.setImageResource(R.drawable.knopkaser_nazh);
                new CountDownTimer(300, 1000) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        yuzh.setImageResource(R.drawable.knopkaser);
                        Intent i = new Intent(Menu.this, Yuzh.class);
                        startActivity(i);
                    }
                }.start();
            }
        });

        priv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                priv.setImageResource(R.drawable.knopkaser_nazh);
                new CountDownTimer(300, 1000) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        priv.setImageResource(R.drawable.knopkaser);
                        Intent i = new Intent(Menu.this, Priv.class);
                        startActivity(i);
                    }
                }.start();
            }
        });

        ural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ural.setImageResource(R.drawable.knopkaser_nazh);
                new CountDownTimer(300, 1000) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        ural.setImageResource(R.drawable.knopkaser);
                        Intent i = new Intent(Menu.this, Ural.class);
                        startActivity(i);
                    }
                }.start();
            }
        });

        sibir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sibir.setImageResource(R.drawable.knopkaser_nazh);
                new CountDownTimer(300, 1000) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        sibir.setImageResource(R.drawable.knopkaser);
                        Intent i = new Intent(Menu.this, Sibir.class);
                        startActivity(i);
                    }
                }.start();
            }
        });

        daln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daln.setImageResource(R.drawable.knopkaser_nazh);
                new CountDownTimer(300, 1000) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        daln.setImageResource(R.drawable.knopkaser);
                        Intent i = new Intent(Menu.this, Daln.class);
                        startActivity(i);
                    }
                }.start();
            }
        });

        dann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dann.setImageResource(R.drawable.knopkaser_nazh);
                new CountDownTimer(300, 1000) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        dann.setImageResource(R.drawable.knopkaser);
                        Intent i = new Intent(Menu.this, Admin.class);
                        startActivity(i);
                    }
                }.start();
            }
        });


    }
}
