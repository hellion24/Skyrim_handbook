package com.example.kursovaya

import com.example.kursovaya.Sost

object Sost {
    private val sost = Array(8) { IntArray(3) }
    fun generate() {
        sost[1][1] = 1
        sost[1][2] = 1
        sost[1][0] = 2
        sost[2][1] = 2
        sost[2][2] = 1
        sost[2][0] = 1
        sost[3][1] = 2
        sost[3][2] = 1
        sost[3][0] = 0
        sost[4][1] = 0
        sost[4][2] = 2
        sost[4][0] = 0
        sost[5][1] = 1
        sost[5][2] = 2
        sost[5][0] = 1
        sost[6][1] = 0
        sost[6][2] = 2
        sost[6][0] = 2
        sost[7][1] = 1
        sost[7][2] = 0
        sost[7][0] = 2
        sost[0][1] = 1
        sost[0][2] = 2
        sost[0][0] = 1
    }

    operator fun set(reg: Int, sosto: Int, got: Int) {
        sost[reg][sosto] = got
    }

    @JvmStatic
    operator fun get(reg: Int, sosto: Int): String {
        when (sost[reg][sosto]) {
            0 -> return "Плохое"
            1 -> return "Среднее"
            2 -> return "Хорошее"
        }
        return "Ошибка"
    }
}