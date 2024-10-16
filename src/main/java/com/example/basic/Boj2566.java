package com.example.basic;

import java.util.Scanner;

public class Boj2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = 0;
        int maxNIndex = 0;
        int maxMIndex = 0;

        for (int i=0;i<9;i++) {
            for (int j=0;j<9;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i=0;i<9;i++) {
            for (int j=0;j<9;j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxNIndex = i;
                    maxMIndex = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((maxNIndex+1)+" "+(maxMIndex+1));

        sc.close();
    }
}
