package com.company;

import java.util.Random;

public class Task8_12 {

    public static void main(String[] args) {
        int athlete = 15;
        int program = 3;
        int scores[][] = new int[athlete][program];
        int sumOfAthlete[] = new int[athlete];
        int sumOfPointsAthlete =0;

        Random random = new Random();

        for (int i = 0; i < athlete; i++) {
            for (int j = 0; j < program; j++) {
                scores[i][j] = random.nextInt(10) + 1;
            }
        }

        for (int i = 0; i < athlete; i++) {
            for (int j = 0; j < program; j++) {
                System.out.printf("%-5d", scores[i][j]);
            }
            System.out.println();
        }

        // TODO: 30.06.2021 the average score of each athlete
        System.out.printf("++++++++++++++++++++");
        System.out.println();

        for (int i = 0; i < athlete; i++) {
            sumOfAthlete[i] = 0;

        }

        for (int i = 0; i < athlete; i++) {
            for (int j = 0; j < program; j++) {
                sumOfAthlete[i] += scores[i][j];
                sumOfPointsAthlete += sumOfAthlete[i];
            }
        }

        for (int i = 0; i < athlete; i++) {

            System.out.printf("%-5d", sumOfAthlete[i]);

            sumOfPointsAthlete += sumOfAthlete[i];
            System.out.println(" - сумма баллов спортсмена № "+(i+1));

            double avgAthlete = (double) (sumOfAthlete[i] / (double)program);
            System.out.println("Среднее количество баллов спортсмена = " +avgAthlete);
        }

    }
}