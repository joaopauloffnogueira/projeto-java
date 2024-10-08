package edu.joaopaulo.javabasico.debbuging;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDeMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculadoraMediaDaTurma(alunos, scanner);
        System.out.printf(Locale.US, "Média da turma %.1f", media);
    }

    public static double calculadoraMediaDaTurma(String[] alunos, Scanner scanner){
        double soma = 0;
        for (String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextInt();
            soma += nota;
        }
        return soma / alunos.length;
    };
}
