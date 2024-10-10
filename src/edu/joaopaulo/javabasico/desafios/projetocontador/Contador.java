package edu.joaopaulo.javabasico.desafios.projetocontador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro:");
        int primeiroParametro = scanner.nextInt();

        System.out.println("Digite o segundo parametro:");
        int segundoParametro = scanner.nextInt();

        try{
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }
    }
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException("Error: O valor do primeiro parametro deve ser menor que o segundo.");
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprime o valor " + i);
        }
    }
}