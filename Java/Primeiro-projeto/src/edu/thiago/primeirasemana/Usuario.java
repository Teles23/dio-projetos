package edu.thiago.primeirasemana;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV LIGADA?" + smartTv.ligada);
        System.out.println("CANAL ATUAL:" + smartTv.canal);
        System.out.println("VOLUME ATUAL:" + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV LIGADA?" + smartTv.ligada);
        smartTv.desligar();
        System.out.println("TV LIGADA?" + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("VOLUME ATUAL:" + smartTv.volume);
        smartTv.mudarCanal(2);
        System.out.println("CANAL ATUAL:" + smartTv.canal);

    }
}
