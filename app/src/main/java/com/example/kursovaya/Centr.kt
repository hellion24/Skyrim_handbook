package com.example.kursovaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.os.CountDownTimer
import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Centr : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.centr)
        val back = findViewById<View>(R.id.dann3) as ImageButton

        back.setOnClickListener {
            back.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    back.setImageResource(R.drawable.knopkaser)
                    val i = Intent(this@Centr, Category::class.java)
                    i.putExtra("text",intent.getStringExtra("text2"))
                    startActivity(i)
                }
            }.start()
        }

        val head = findViewById<View>(R.id.textView3) as TextView
        val textt = findViewById<View>(R.id.textView19) as TextView
        val image = findViewById<View>(R.id.imageView11) as ImageView

        when (intent.getStringExtra("text2")){
            "pers" -> {
                when (intent.getStringExtra("id")){
                    "1" -> {
                        head.text = getString(R.string.pers1)
                        textt.text = getString(R.string.pers1i)
                        image.setImageResource(R.drawable.pers1)
                    }
                    "2" -> {
                        head.text = getString(R.string.pers2)
                        textt.text = getString(R.string.pers2i)
                        image.setImageResource(R.drawable.pers2)
                    }
                    "3" -> {
                        head.text = getString(R.string.pers3)
                        textt.text = getString(R.string.pers3i)
                        image.setImageResource(R.drawable.pers3)
                    }
                    "4" -> {
                        head.text = getString(R.string.pers4)
                        textt.text = getString(R.string.pers4i)
                        image.setImageResource(R.drawable.pers4)
                    }
                }
            }
            "skills" -> {
                when (intent.getStringExtra("id")){
                    "1" -> {
                        head.text = getString(R.string.skills1)
                        textt.text = getString(R.string.skills1i)
                        image.setImageResource(R.drawable.skills1i)
                    }
                    "2" -> {
                        head.text = getString(R.string.skills2)
                        textt.text = getString(R.string.skills2i)
                        image.setImageResource(R.drawable.skills2i)
                    }
                    "3" -> {
                        head.text = getString(R.string.skills3)
                        textt.text = getString(R.string.skills3i)
                        image.setImageResource(R.drawable.skills3i)
                    }
                    "4" -> {
                        head.text = getString(R.string.skills4)
                        textt.text = getString(R.string.skills4i)
                        image.setImageResource(R.drawable.skills4i)
                    }
                }
            }
            "quests" -> {
                when (intent.getStringExtra("id")){
                    "1" -> {
                        head.text = getString(R.string.quests1)
                        textt.text = getString(R.string.quests1i)
                        image.setImageResource(R.drawable.quests1i)
                    }
                    "2" -> {
                        head.text = getString(R.string.quests2)
                        textt.text = getString(R.string.quests2i)
                        image.setImageResource(R.drawable.quests2i)
                    }
                    "3" -> {
                        head.text = getString(R.string.quests3)
                        textt.text = getString(R.string.quests3i)
                        image.setImageResource(R.drawable.quests3i)
                    }
                    "4" -> {
                        head.text = getString(R.string.quests4)
                        textt.text = getString(R.string.quests4i)
                        image.setImageResource(R.drawable.quests4i)
                    }
                }
            }
            "locations" -> {
                when (intent.getStringExtra("id")){
                    "1" -> {
                        head.text = getString(R.string.locations1)
                        textt.text = getString(R.string.locations1i)
                        image.setImageResource(R.drawable.locations1i)
                    }
                    "2" -> {
                        head.text = getString(R.string.locations2)
                        textt.text = getString(R.string.locations2i)
                        image.setImageResource(R.drawable.locations2i)
                    }
                    "3" -> {
                        head.text = getString(R.string.locations3)
                        textt.text = getString(R.string.locations3i)
                        image.setImageResource(R.drawable.locations3i)
                    }
                    "4" -> {
                        head.text = getString(R.string.locations4)
                        textt.text = getString(R.string.locations4i)
                        image.setImageResource(R.drawable.locations4i)
                    }
                }
            }
            else -> head.text = "Вы ДАПУСТИЛИ АШЫПКУ"
        }
    }
}