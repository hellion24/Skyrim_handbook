package com.example.kursovaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kursovaya.R
import android.widget.ImageButton
import android.os.CountDownTimer
import android.content.Intent
import android.view.View

class Contacts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contacts)
        val back = findViewById<View>(R.id.dann2) as ImageButton
        back.setOnClickListener {
            back.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    back.setImageResource(R.drawable.knopkaser)
                    val i = Intent(this@Contacts, Menu::class.java)
                    startActivity(i)
                }
            }.start()
        }
    }
}