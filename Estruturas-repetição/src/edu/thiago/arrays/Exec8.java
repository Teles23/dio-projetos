package edu.thiago.arrays;

import java.util.Random;

public class Exec8 {
    public static void main(String[] args) {
        Random random = new Random();

        int []  numerosAleatorios= new int [20];

        for(int i =0; i< numerosAleatorios.length; i++){
            numerosAleatorios[i] = random.nextInt(100);

        }
        for (int numero : numerosAleatorios) {
            System.out.print(numero+" ");
        }
        System.out.println("\n");
        for (int numero : numerosAleatorios) {
            System.out.print(numero+1+" ");
        }
    }
}
