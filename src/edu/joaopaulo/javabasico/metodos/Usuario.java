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

        // -- Status Canal
        System.out.println("=== Testando Canal ===");
        smartTv.aumentarCanal();
        smartTv.diminuirVolume();
        smartTv.diminuirCanal();
        System.out.println("");

        // -- Testando volume
        System.out.println("=== Testando Volume ===");
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("");

        // -- Testando Canal
        System.out.println("=== Testando Canal ===");
        smartTv.mudarCanal(45);
        System.out.println("");

        // -- Status Final
        System.out.println("=== Novo Status ===");
        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
    }
}
