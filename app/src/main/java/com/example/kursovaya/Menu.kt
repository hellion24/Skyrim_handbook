package com.example.kursovaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kursovaya.R
import android.widget.ImageButton
import android.os.CountDownTimer
import android.content.Intent
import android.view.View
import com.example.kursovaya.Centr
import com.example.kursovaya.Sevz
import com.example.kursovaya.Sevk
import com.example.kursovaya.Yuzh
import com.example.kursovaya.Priv
import com.example.kursovaya.Ural
import com.example.kursovaya.Sibir
import com.example.kursovaya.Daln
import com.example.kursovaya.Admin

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)
        val centr: ImageButton
        val sevz: ImageButton
        val yuzh: ImageButton
        val sevk: ImageButton
        val priv: ImageButton
        val ural: ImageButton
        val sibir: ImageButton
        val daln: ImageButton
        val svyaz: ImageButton
        val dann: ImageButton
        centr = findViewById<View>(R.id.centr) as ImageButton
        sevz = findViewById<View>(R.id.sevz) as ImageButton
        yuzh = findViewById<View>(R.id.yuzh) as ImageButton
        sevk = findViewById<View>(R.id.sevk) as ImageButton
        priv = findViewById<View>(R.id.priv) as ImageButton
        ural = findViewById<View>(R.id.ural) as ImageButton
        sibir = findViewById<View>(R.id.sibir) as ImageButton
        daln = findViewById<View>(R.id.dalv) as ImageButton
        svyaz = findViewById<View>(R.id.svyaz) as ImageButton
        dann = findViewById<View>(R.id.dann) as ImageButton
        svyaz.setOnClickListener {
            svyaz.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    svyaz.setImageResource(R.drawable.knopkaser)
                    val i = Intent(this@Menu, Contacts::class.java)
                    startActivity(i)
                }
            }.start()
        }
        centr.setOnClickListener {
            centr.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    centr.setImageResource(R.drawable.knopkaser)
                    val i = Intent(this@Menu, Centr::class.java)
                    startActivity(i)
                }
            }.start()
        }
        sevz.setOnClickListener {
            sevz.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    sevz.setImageResource(R.drawable.knopkaser)
                    val i = Intent(this@Menu, Sevz::class.java)
                    startActivity(i)
                }
            }.start()
        }
        sevk.setOnClickListener {
            sevk.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    sevk.setImageResource(R.drawable.knopkaser)
                    val i = Intent(this@Menu, Sevk::class.java)
                    startActivity(i)
                }
            }.start()
        }
        yuzh.setOnClickListener {
            yuzh.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    yuzh.setImageResource(R.drawable.knopkaser)
                    val i = Intent(this@Menu, Yuzh::class.java)
                    startActivity(i)
                }
            }.start()
        }
        priv.setOnClickListener {
            priv.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    priv.setImageResource(R.drawable.knopkaser)
                    val i = Intent(this@Menu, Priv::class.java)
                    startActivity(i)
                }
            }.start()
        }
        ural.setOnClickListener {
            ural.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    ural.setImageResource(R.drawable.knopkaser)
                    val i = Intent(this@Menu, Ural::class.java)
                    startActivity(i)
                }
            }.start()
        }
        sibir.setOnClickListener {
            sibir.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    sibir.setImageResource(R.drawable.knopkaser)
                    val i = Intent(this@Menu, Sibir::class.java)
                    startActivity(i)
                }
            }.start()
        }
        daln.setOnClickListener {
            daln.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    daln.setImageResource(R.drawable.knopkaser)
                    val i = Intent(this@Menu, Daln::class.java)
                    startActivity(i)
                }
            }.start()
        }
        dann.setOnClickListener {
            dann.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    dann.setImageResource(R.drawable.knopkaser)
                    val i = Intent(this@Menu, Admin::class.java)
                    startActivity(i)
                }
            }.start()
        }
    }
}