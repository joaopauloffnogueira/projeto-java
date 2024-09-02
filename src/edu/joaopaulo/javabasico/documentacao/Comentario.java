package edu.joaopaulo.javabasico.documentacao;

public class Comentario {

    public static void main(String[] args) {

    }


    /**
     * Imprime a tabuada de multiplicação para o número especificado.
     *
     * Este método gera e imprime a tabuada do número fornecido,
     * exibindo os resultados da multiplicação do número por valores de 0 a 10.
     *
     * @param numero O número para o qual a tabuada será gerada.
     */
    public void tabuada(int numero) {
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    // Gerar uma documentação
    // javadoc-encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java
}



