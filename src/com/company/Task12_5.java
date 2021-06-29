package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task12_5 {

    public static void main(String[] args) {
        int arrayStrings = 7;
        int arrayColumns = 5;
        int numbersInArray[][] = new int[arrayStrings][arrayColumns];

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < arrayStrings; i++) {
            for (int j = 0; j < arrayColumns; j++) {
                numbersInArray[i][j] = random.nextInt(99) + 1;
            }
        }

        for (int i = 0; i < arrayStrings; i++) {
            for (int j = 0; j < arrayColumns; j++) {
                System.out.printf("%-5d", numbersInArray[i][j]);
            }
            System.out.println();
        }

        // TODO: 29.06.2021 all elements of line 5
        System.out.printf("--------------------------------");
        System.out.println();

        int fifthlineArray=5;

        for (int i = fifthlineArray-1; i < fifthlineArray; i++) {
            for (int j = 0; j < arrayColumns; j++) {

                System.out.printf("%-5d", numbersInArray[i][j]);
            }
            System.out.println();
        }

        // TODO: 29.06.2021 all s-column elements of the array
        System.out.printf("--------------------------------");
        System.out.println();

        int columnArray;
        System.out.println("Введите столбец числа S: ");
        columnArray = input.nextInt();

        for (int i = 0; i < arrayStrings; i++) {
            for (int j = columnArray-1; j < columnArray; j++) {

                System.out.printf("%-5d", numbersInArray[i][j]);
            }
            System.out.println();
        }

    }
}