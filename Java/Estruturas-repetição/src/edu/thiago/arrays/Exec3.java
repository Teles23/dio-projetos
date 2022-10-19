package edu.thiago.arrays;

import java.util.Scanner;

public class Exec3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int count = 1;
        int soma =0;
        do {
            System.out.println("Numero " + count + ":");
            numero = scan.nextInt();
            if (numero > maior) maior = numero;
            soma = soma +numero;
            count++;

        } while (count < 6);
        System.out.println("Numero maior é: " + maior);
        System.out.println("A media é:"+soma/5);
    }
}
