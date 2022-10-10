import java.util.Scanner;
public class NumerosIguais {

    // IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe
    // Scanner,
    // instanciando seu leitor da seguinte forma: "Scanner leitor = new
    // Scanner(System.in);".
    // Por outro lado, para imprimir suas saídas, utilize System.out.print ou
    // System.out.println.
    
    public static void main(String[] args) {
        // TODO: Imprima se os valores numéricos passados são iguais ou não.
        Scanner leitor = new Scanner(System.in);

        int a = 0, b = 0;

        // System.out.println("Digite o primeiro numero: ");
        a = leitor.nextInt();
        // System.out.println("Digite o segundo numero: ");
        b = leitor.nextInt();

        if (a == b) {
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");
        }
    }
}
