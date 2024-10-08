package edu.joaopaulo.javabasico.desafio.contabancaria;

import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

        // Atributos da Conta
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        // Criar um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário e capturar as entradas
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente do nextInt()

        System.out.println("Por favor, digite o seu nome completo:");
        nomeCliente = scanner.nextLine(); // Captura o nome completo

        System.out.println("Por favor, digite o seu saldo:");
        saldo = scanner.nextFloat();

        // Exibir os dados confirmados
        System.out.println("\n\nConfirmando os dados:");
        System.out.println("Número da Conta: " + numero);
        System.out.println("Número da Agência: " + agencia);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo da Conta: " + saldo);
        System.out.println("\n\n");

        // Exibir a mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");

        // Fechar o scanner
        scanner.close();

    }
}
