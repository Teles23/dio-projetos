import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();
        verificar(num);
        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num".
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o
        // enunciado.

    }

    static void verificar(int numero) {
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (numero % 3 == 0) {
            System.out.println("Fizz");
        } else if (numero % 5 == 0)
            System.out.println("Buzz");
        else
            System.out.println(numero);
    }
}
