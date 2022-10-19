package edu.thiago.arrays;

// Ordem inversa
public class Exec6 {
    public static void main(String[] args) {
        int[] vetor = { 3, 5, -5, 3, 2, 80 };

        for (int i = (vetor.length - 1); i > 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
