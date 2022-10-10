package edu.thiago.arrays;

import java.util.Random;

public class Exec9 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matrizAleatoria = new int[4][4];

        for (int i = 0; i < matrizAleatoria.length; i++) {
            for (int j = 0; j < matrizAleatoria[i].length; j++) {
                matrizAleatoria[i][j] = random.nextInt(9);
            }
        }

        for (int[] linha: matrizAleatoria) {
            for (int coluna : linha) {
                System.out.print(coluna+ " ");
            }
           System.out.println();
        }
    }

}