package com.example.kursovaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kursovaya.R
import android.widget.ImageButton
import android.widget.EditText
import android.os.CountDownTimer
import android.content.Intent
import android.view.View
import android.widget.TextView
import com.example.kursovaya.Sost

class Izm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.izm)
        val back = findViewById<View>(R.id.dann3) as ImageButton
        val change = findViewById<View>(R.id.dann4) as ImageButton
        val nazv: EditText
        val vozd: EditText
        val voda: EditText
        val poch: EditText
        nazv = findViewById<View>(R.id.nazvReg) as EditText
        vozd = findViewById<View>(R.id.sostVozd) as EditText
        voda = findViewById<View>(R.id.sostVod) as EditText
        poch = findViewById<View>(R.id.sostPoch) as EditText
        back.setOnClickListener {
            back.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    back.setImageResource(R.drawable.knopkaser)
                    val i = Intent(this@Izm, Menu::class.java)
                    startActivity(i)
                }
            }.start()
        }
        val osh = findViewById<View>(R.id.osh) as TextView
        change.setOnClickListener {
            change.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    change.setImageResource(R.drawable.knopkaser)
                    if ((vozd.text.toString() == "0" || vozd.text.toString() == "1" || vozd.text.toString() == "2") && (voda.text.toString() == "0" || voda.text.toString() == "1" || voda.text.toString() == "2") && (poch.text.toString() == "0" || poch.text.toString() == "1" || poch.text.toString() == "2")) {
                        osh.text = "Данные успешно изменены"
                        when (nazv.text.toString()) {
                            "Центральный" -> {
                                Sost.set(0, 0, vozd.text.toString().trim { it <= ' ' }.toInt())
                                Sost.set(0, 1, voda.text.toString().trim { it <= ' ' }.toInt())
                                Sost.set(0, 2, poch.text.toString().trim { it <= ' ' }.toInt())
                            }
                            "Северо-Западный" -> {
                                Sost.set(1, 0, vozd.text.toString().trim { it <= ' ' }.toInt())
                                Sost.set(1, 1, voda.text.toString().trim { it <= ' ' }.toInt())
                                Sost.set(1, 2, poch.text.toString().trim { it <= ' ' }.toInt())
                            }
                            "Южный" -> {
                                Sost.set(2, 0, vozd.text.toString().trim { it <= ' ' }.toInt())
                                Sost.set(2, 1, voda.text.toString().trim { it <= ' ' }.toInt())
                                Sost.set(2, 2, poch.text.toString().trim { it <= ' ' }.toInt())
                            }
                            "Северо-Кавказский" -> {
                                Sost.set(3, 0, vozd.text.toString().trim { it <= ' ' }.toInt())
                                Sost.set(3, 1, voda.text.toString().trim { it <= ' ' }.toInt())
                                Sost.set(3, 2, poch.text.toString().trim { it <= ' ' }.toInt())
                            }
                            "Приволжский" -> {
                                Sost.set(4, 0, vozd.text.toString().trim { it <= ' ' }.toInt())
                                Sost.set(4, 1, voda.text.toString().trim { it <= ' ' }.toInt())
                                Sost.set(4, 2, poch.text.toString().trim { it <= ' ' }.toInt())
                            }
                            "Уральский" -> {
                                Sost.set(5, 0, vozd.text.toString().trim { it <= ' ' }.toInt())
                                Sost.set(5, 1, voda.text.toString().trim { it <= ' ' }.toInt())
                                Sost.set(5, 2, poch.text.toString().trim { it <= ' ' }.toInt())
                            }
                            "Сибирский" -> {
                                Sost.set(6, 0, vozd.text.toString().trim { it <= ' ' }.toInt())
                                Sost.set(6, 1, voda.text.toString().trim { it <= ' ' }.toInt())
                                Sost.set(6, 2, poch.text.toString().trim { it <= ' ' }.toInt())
                            }
                            "Дальневосточный" -> {
                                Sost.set(7, 0, vozd.text.toString().trim { it <= ' ' }.toInt())
                                Sost.set(7, 1, voda.text.toString().trim { it <= ' ' }.toInt())
                                Sost.set(7, 2, poch.text.toString().trim { it <= ' ' }.toInt())
                            }
                            else -> osh.text = "Ошибка при вводе данных"
                        }
                    }
                }
            }.start()
        }
    }
}