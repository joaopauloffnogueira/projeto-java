package edu.joaopaulo.javabasico.tratamentodeexecoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {

    /**
     * A linguagem Java dispõe de uma variedade de classes que representam exceções, e estas classes são organizadas
     * em uma hierarquia denominadas Checked and Unchecked Exceptions ou Exceções Checadas e Não Checadas.
     * <p>
     *
     * <h2>hierarquia de erros</h2>
     *
     * <li>Throwable > Error e Exception</li>
     * <br>
     * <li>Excepiton > RuntimeException e IOException, SQLException, MalformedURLException</li>
     * <br>
     * <li>RuntimeException > NullPointerException, NumberFormatException, ClassCastException, IndexOutOfBoundsException ...</li>
     */

    public static void main(String[] args) {
        //Number valor = Double.valueOf("a1.75"); // Converte o valor String para numero
        // Além disso acessou o valueOf para explicar e também o throws NumberFormatException
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75"); // Converte o valor String para numero
            System.out.println(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
