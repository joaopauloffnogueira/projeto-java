package edu.joaopaulo.javabasico.tratamentodeexecoes;


import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digente seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobreNome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobreNome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "cm");
            scanner.close();
        }
        catch (InputMismatchException e){
            System.out.println("O campos idade e altura precisam ser numéricos, utilize ponto em altura em vez de vírgula.");
        };
    }
}
