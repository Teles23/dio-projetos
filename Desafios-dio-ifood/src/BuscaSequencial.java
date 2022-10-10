import java.util.Scanner;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[] elementos = { 64, 137, -16, 43, 67, 81, -90, 212, 10, 75 };

        // TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.
        int x = 0, pos = -1;
        x = leitor.nextInt();

        posicao(x, elementos);

        pos = posicao(x, elementos);
        if (pos == -1)
            System.out.println("Numero " + x + " nao encontrado!");
        else
            System.out.println("Achei " + x + " na posicao " + pos);

    }

    static int posicao(int x, int[] elementos) {
        int pos = -1;
        for (int i = 0; i < elementos.length; i++) {
            if (x == elementos[i]) {
                pos = i;
            }
        }
        return pos;
    }
}