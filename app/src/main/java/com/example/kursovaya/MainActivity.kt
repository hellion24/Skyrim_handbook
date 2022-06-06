package com.example.kursovaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kursovaya.R
import com.example.kursovaya.Sost
import android.content.Intent
import android.view.Window
import com.google.firebase.database.DatabaseReference

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)
        Sost.generate()
        val logoTimer: Thread = object : Thread() {
            override fun run() {
                try {
                    var logoTimer = 0
                    while (logoTimer < 1000) {
                        sleep(100)
                        logoTimer = logoTimer + 100
                    }
                    val i = Intent(this@MainActivity, Menu::class.java)
                    startActivity(i)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                } finally {
                    finish()
                }
            }
        }
        logoTimer.start()
    }
}