import java.util.Scanner;

public class Somatorio {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        // TODO: Imprima o somatório de N (utilize o método "somatorio").
        int n = 0;
        n = numero.nextInt();
        System.out.println(somatorio(n));
    }

    /**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}