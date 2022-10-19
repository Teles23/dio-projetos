package edu.thiago.collections.list;

import java.util.*;

public class Temperatura {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> temperaturas = new ArrayList<Double>();

        int count = 0;
        while (true) {
            if (count == 6)
                break;

            System.out.print("Digite acimaMedia temperatura: ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            count++;
        }
        System.out.print("Todas as temperaturas: ");
        temperaturas.forEach(t -> System.out.print(t + " "));

        double media = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\nMédia das temperaturas: %.1f\n", media);

        // exibindo as temperaturas acima da média
        System.out.print("Temperaturas acima da média: ");
        temperaturas.stream().filter(t -> t > media).forEach(t -> System.out.printf("%.1f ", t));

        // exibindo o mês das temperaturas acima da média por extenso:
        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator();
        int acimaMedia =0;
        count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > media) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;
                    
                }
                
                acimaMedia++;
            }
            count++;
            
        }
        if(acimaMedia==0)System.out.println("Não houve temperatura acima da média.");
        
    }
}
