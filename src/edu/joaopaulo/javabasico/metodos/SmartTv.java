package edu.joaopaulo.javabasico.metodos;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }


    public void mudarCanal(int novoCanal){
        this.canal = novoCanal;
    }
    public void aumentarCanal(){
        this.canal++;
    }

    public void diminuirCanal() {
        this.canal--;
    }

    public void aumentarVolume(){
        this.volume++;
        System.out.println("Aumentando o volume: " + this.volume);
    }

    public void diminuirVolume() {
        this.volume--;
        System.out.println("Diminuindo o volume: " + this.volume);
    }
    

}
