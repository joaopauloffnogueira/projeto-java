package edu.joaopaulo.javabasico.metodos;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        // -- Status Inicial
        System.out.println("=== Informação inicial ===");
        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
        System.out.println("");

        // -- Status Tv
        System.out.println("=== Testando Tv ===");
        smartTv.ligar();
        System.out.println("TV ligada: " + smartTv.ligada);
        smartTv.mudarCanal(7);
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
    }
}
