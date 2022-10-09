package edu.thiago.arrays;

import java.util.Scanner;

public class Exec4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        int numero;
        int qtdPares = 0, qtdImpares = 0;

        System.out.println("Digite a quantidade de números: ");
        qtdNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if (numero % 2 == 0)
                qtdPares++;
            else
                qtdImpares++;
            count++;
        } while (count < qtdNumeros);
        System.out.println("Quantidade de numeros impares: " + qtdImpares);
        System.out.println("Quantidade de numeros pares: " + qtdPares);
    }
}
