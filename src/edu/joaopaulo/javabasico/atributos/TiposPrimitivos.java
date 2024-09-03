package edu.joaopaulo.javabasico.atributos;


public class TiposPrimitivos {

    byte numerosByte = 127;
    short numerosCurto = 32_767;
    int numerosInteiros = 2_147_483_647;
    long numerosLongos = 9_223_372_036_854_775_807L;
    float numerosFloat = 3.4F;
    double numerosDouble = 21.45;
    String texto = "texto qualquer";
    char letra = 'A';
    boolean verdadeiro = true;
    boolean falso = false;


    // --------------------------------------------------
    // Exemplo prático:
    public static void main(String[] args) {
        String nome = "João Paulo";
        int idade = 28;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorSangue = false;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Sexo: " + sexo);
        System.out.println("Doador de Samgue: " + doadorSangue);
    }

}
