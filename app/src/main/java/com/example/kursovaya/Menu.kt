package com.example.kursovaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.os.CountDownTimer
import android.content.Intent
import android.view.View

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)
        val pers: ImageButton
        val locacii: ImageButton
        val quests: ImageButton
        val skills: ImageButton
        val svyaz: ImageButton
        pers = findViewById<View>(R.id.pers) as ImageButton
        locacii = findViewById<View>(R.id.lokacii) as ImageButton
        quests = findViewById<View>(R.id.quests) as ImageButton
        skills = findViewById<View>(R.id.skills) as ImageButton
        svyaz = findViewById<View>(R.id.svyaz) as ImageButton

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
        pers.setOnClickListener {
            pers.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    pers.setImageResource(R.drawable.knopkaser)
                    val i = Intent(this@Menu, Category::class.java)
                    i.putExtra("text","pers")
                    startActivity(i)
                }
            }.start()
        }
        locacii.setOnClickListener {
            locacii.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    locacii.setImageResource(R.drawable.knopkaser)
                    val i = Intent(this@Menu, Category::class.java)
                    i.putExtra("text","locations")
                    startActivity(i)
                }
            }.start()
        }
        quests.setOnClickListener {
            quests.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    quests.setImageResource(R.drawable.knopkaser)
                    val i = Intent(this@Menu, Category::class.java)
                    i.putExtra("text","quests")
                    startActivity(i)
                }
            }.start()
        }
        skills.setOnClickListener {
            skills.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    skills.setImageResource(R.drawable.knopkaser)
                    val i = Intent(this@Menu, Category::class.java)
                    i.putExtra("text","skills")
                    startActivity(i)

                }
            }.start()
        }
    }
}

// сначала в put extra положить название раздела и в соответствии с ним вписать имена кнопок и название наверху
// потом id кнопки, в соответствии с разделом и id кнопки вписать текст и картинку из ресурсов