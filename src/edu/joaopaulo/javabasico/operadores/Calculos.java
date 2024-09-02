package edu.joaopaulo.javabasico.operadores;

public class Calculos {
    public static void main(String[] args) {

        int a, b, y;
        boolean c, d;

        // -- Multiplicação
        a = 2;
        b = 4;
        y = a * b;
        System.out.println("Multiplicação, resultado: " + y);


        // -- Multiplicação
        a = 4;
        b = 2;
        y = a - b;
        System.out.println("Subtração, resultado: " + y);


        // -- Adição
        a = 3;
        b = 1;
        y = a + b;
        System.out.println("Adição, resultado: " + y);


        // -- Divisão
        a = 4;
        b = 2;
        y = a / b;
        System.out.println("Divisão, resultado: " + y);


        // -- Resto de Divisão
        a = 5;
        b = 3;
        y = a % b;
        System.out.println("Resto de Divisão, resultado: " + y);


        // -- Atribuição
        a = 2;
        a++;

        System.out.println("Atribuição: " + a);


        // -- Boleanos
        c = true;
        d = false;
        System.out.println("Valor de c: " + c + " | Valor de d: " + d);
        c = false;
        d = true;
        System.out.println("Valor de c: " + c + " | Valor de d: " + d);


        // -- Operador Ternário
        a = 6;
        b = 6;
        /*
        // Exemplo 1
        if (a==b)
            c = true;
        else
            c = false;
        */
        // Exemplo 2
        c = a==b ? true : false;

        System.out.println("Resultado Ternário: " + c);


        // -- Comparações para texto e objetos
        String nomeUm = "Paulo";
        String nomeDois = "Paulo";
        System.out.println("Comparação de texto: " + nomeUm.equals(nomeDois));


        // -- Comparações para números ==
        a = 7;
        b = 7;
        d = a==b;
        System.out.println("A é igual a B?: " + d);


        // -- Comparações para números >
        a = 8;
        b = 7;
        d = a>b;
        System.out.println("A é maior que B?: " + d);

        // -- Comparações para números <
        a = 8;
        b = 7;
        d = a<b;
        System.out.println("A é menor que B?: " + d);

        // -- Comparações para números !=
        a = 8;
        b = 7;
        d = a!=b;
        System.out.println("A é diferente de B?: " + d);


    }
}
