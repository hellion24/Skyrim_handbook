package com.example.kursovaya;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Admin extends AppCompatActivity {
    EditText login, pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin);
        ImageButton back = (ImageButton)findViewById(R.id.dann2);
        ImageButton confirm = (ImageButton)findViewById(R.id.dann5);

        login = (EditText)findViewById(R.id.login);
        pass = (EditText)findViewById(R.id.login2);
        TextView osh = (TextView)findViewById(R.id.osh1);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back.setImageResource(R.drawable.knopkaser_nazh);
                new CountDownTimer(300, 1000) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        back.setImageResource(R.drawable.knopkaser);
                        Intent i = new Intent(Admin.this, Menu.class);
                        startActivity(i);
                    }
                }.start();
            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirm.setImageResource(R.drawable.knopkaser_nazh);
                new CountDownTimer(300, 1000) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        confirm.setImageResource(R.drawable.knopkaser);
                        if((login.getText().toString().trim()=="admin")&&(pass.getText().toString().trim()=="admin")) {
                            Intent i = new Intent(Admin.this, Izm.class);
                            startActivity(i);
                        }
                        else{
                            osh.setText("Неверные данные");
                        }
                    }
                }.start();
            }
        });
    }
}