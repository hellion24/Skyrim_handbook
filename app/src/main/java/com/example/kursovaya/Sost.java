package com.example.kursovaya;

public class Sost {
    private static int[][] sost = new int[8][3];

    public static void generate() {
        sost[1][1]=1;
        sost[1][2]=1;
        sost[1][0]=2;
        sost[2][1]=2;
        sost[2][2]=1;
        sost[2][0]=1;
        sost[3][1]=2;
        sost[3][2]=1;
        sost[3][0]=0;
        sost[4][1]=0;
        sost[4][2]=2;
        sost[4][0]=0;
        sost[5][1]=1;
        sost[5][2]=2;
        sost[5][0]=1;
        sost[6][1]=0;
        sost[6][2]=2;
        sost[6][0]=2;
        sost[7][1]=1;
        sost[7][2]=0;
        sost[7][0]=2;
        sost[0][1]=1;
        sost[0][2]=2;
        sost[0][0]=1;
    }
    public static void set(int reg, int sosto, int got){
        sost[reg][sosto] = got;
    }

    public static String get(int reg, int sosto){
        switch (sost[reg][sosto]){
            case (0):
                return "Плохое";
            case(1):
                return "Среднее";
            case(2):
                return "Хорошее";
        }
        return "Ошибка";
    }
}
