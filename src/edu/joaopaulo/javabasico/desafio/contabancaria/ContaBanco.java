package edu.joaopaulo.javabasico.desafio.contabancaria;

import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        // Atributos da Conta
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        // importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.next();
        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite o seu nome:");
        nomeCliente = scanner.next();
        scanner.nextLine();
        System.out.println("Por favor, digite o seu saldo:");
        saldo = scanner.nextFloat();
        System.out.println("\n\n");

        // Obter pela scanner os valores digitados no terminal
        System.out.println("Confirmando os dados");
        System.out.println("Numero da Conta: " + numero);
        System.out.println("Numero da Agencia: " + agencia);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo da Conta: " + saldo);
        System.out.println("\n\n");

        // Exibir a mensagem conta criada

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
