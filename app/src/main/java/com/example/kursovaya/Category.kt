package com.example.kursovaya

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Category : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pers)
        val knopka1: ImageButton
        val knopka2: ImageButton
        val knopka3: ImageButton
        val knopka4: ImageButton
        val knopka5: ImageButton
        val back: ImageButton

        val i = Intent(this@Category, Centr::class.java)

        knopka1 = findViewById<View>(R.id.pers) as ImageButton
        knopka2 = findViewById<View>(R.id.lokacii) as ImageButton
        knopka3 = findViewById<View>(R.id.quests) as ImageButton
        knopka4 = findViewById<View>(R.id.skills) as ImageButton
        knopka5 = findViewById<View>(R.id.skills3) as ImageButton

        back = findViewById<View>(R.id.svyaz) as ImageButton

        val knopka1text = findViewById<View>(R.id.textView7) as TextView
        val knopka2text = findViewById<View>(R.id.textView9) as TextView
        val knopka3text = findViewById<View>(R.id.textView11) as TextView
        val knopka4text = findViewById<View>(R.id.textView13) as TextView
        val knopka5text = findViewById<View>(R.id.textView4) as TextView
        val text5 = findViewById<View>(R.id.textView6) as TextView

        when (intent.getStringExtra("text")){
            "pers" -> {
                text5.text = getString(R.string.pers)
                knopka1text.text = getString(R.string.pers1)
                knopka2text.text = getString(R.string.pers2)
                knopka3text.text = getString(R.string.pers3)
                knopka4text.text = getString(R.string.pers4)
                knopka5text.text = getString(R.string.pers5)
                i.putExtra("text2","pers")
            }
            "skills" -> {
                text5.text = getString(R.string.skills)
                knopka1text.text = getString(R.string.skills1)
                knopka2text.text = getString(R.string.skills2)
                knopka3text.text = getString(R.string.skills3)
                knopka4text.text = getString(R.string.skills4)
                knopka5text.text = getString(R.string.skills5)
                i.putExtra("text2","skills")
            }
            "quests" -> {
                text5.text = getString(R.string.quests)
                knopka1text.text = getString(R.string.quests1)
                knopka2text.text = getString(R.string.quests2)
                knopka3text.text = getString(R.string.quests3)
                knopka4text.text = getString(R.string.quests4)
                knopka5text.text = getString(R.string.quests5)
                i.putExtra("text2","quests")
            }
            "locations" -> {
                text5.text = getString(R.string.locations)
                knopka1text.text = getString(R.string.locations1)
                knopka2text.text = getString(R.string.locations2)
                knopka3text.text = getString(R.string.locations3)
                knopka4text.text = getString(R.string.locations4)
                knopka5text.text = getString(R.string.locations5)
                i.putExtra("text2","locations")
            }
            else -> knopka1text.text = "Вы ДАПУСТИЛИ АШЫПКУ"
        }

        back.setOnClickListener {
            back.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    back.setImageResource(R.drawable.knopkaser)
                    val b = Intent(this@Category, Menu::class.java)
                    startActivity(b)
                }
            }.start()
        }


        knopka1.setOnClickListener {
            knopka1.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    knopka1.setImageResource(R.drawable.knopkaser)
                    i.putExtra("id","1")
                    startActivity(i)
                }
            }.start()
        }

        knopka2.setOnClickListener {
            knopka2.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    knopka2.setImageResource(R.drawable.knopkaser)
                    i.putExtra("id","2")
                    startActivity(i)
                }
            }.start()
        }

        knopka3.setOnClickListener {
            knopka3.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    knopka3.setImageResource(R.drawable.knopkaser)
                    i.putExtra("id","3")
                    startActivity(i)
                }
            }.start()
        }

        knopka4.setOnClickListener {
            knopka4.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    knopka4.setImageResource(R.drawable.knopkaser)
                    i.putExtra("id","4")
                    startActivity(i)
                }
            }.start()
        }

        knopka5.setOnClickListener {
            knopka5.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    knopka5.setImageResource(R.drawable.knopkaser)
                    i.putExtra("id","5")
                    startActivity(i)
                }
            }.start()
        }
    }
}