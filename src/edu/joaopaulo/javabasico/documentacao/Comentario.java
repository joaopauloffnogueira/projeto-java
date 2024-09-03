package edu.joaopaulo.javabasico.documentacao;

public class Comentario {

    public static void main(String[] args) {

    }





    public void tabuada(int numero) {
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    // Gerar uma documentação
    // javadoc-encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java


    /**
     * Calcula a soma de dois números inteiros.
     *
     * Este método recebe dois números inteiros como parâmetros e retorna a soma desses números.
     * A soma é calculada e o resultado é retornado.
     *
     * <h2>Exemplo de Uso:</h2>
     * <pre>
     *   int resultado = calcularSoma(5, 10);
     *   System.out.println("Resultado: " + resultado); // Imprime "Resultado: 15"
     * </pre>
     *
     * <h3>Parâmetros:</h3>
     * <ul>
     *   <li><b>a</b> - O primeiro número inteiro.</li>
     *   <li><b>b</b> - O segundo número inteiro.</li>
     * </ul>
     *
     * <h3>Retorno:</h3>
     * <p>O método retorna a soma dos dois números inteiros.</p>
     *
     * <h3>Exceções:</h3>
     * <p>Este método não lança nenhuma exceção.</p>
     *
     * @param a O primeiro número inteiro.
     * @param b O segundo número inteiro.
     * @return A soma dos dois números inteiros.
     */
    public int calcularSoma(int a, int b) {
        return a + b;
    }

    // ------------------------------------------------------------------------
    /**
     * Calcula a média de uma lista de números inteiros.
     *
     * Este método recebe uma lista de números inteiros e retorna a média aritmética desses números.
     * A média é calculada somando todos os números e dividindo pelo total de números.
     *
     * <h2>Exemplo de Uso:</h2>
     * <pre>
     *   int[] numeros = {10, 20, 30};
     *   double media = calcularMedia(numeros);
     *   System.out.println("Média: " + media); // Imprime "Média: 20.0"
     * </pre>
     *
     * <h3>Parâmetros:</h3>
     * <ul>
     *   <li><b>numeros</b> - Um array de números inteiros para calcular a média.</li>
     * </ul>
     *
     * <h3>Retorno:</h3>
     * <p>O método retorna a média aritmética dos números no array.</p>
     *
     * <h3>Exceções:</h3>
     * <p>Este método lança <code>IllegalArgumentException</code> se o array estiver vazio.</p>
     *
     * <h3>Informações Adicionais:</h3>
     * <table border="1">
     *   <caption>Exemplo de Cálculo de Média</caption>
     *   <thead>
     *     <tr>
     *       <th>Entrada</th>
     *       <th>Média Calculada</th>
     *     </tr>
     *   </thead>
     *   <tbody>
     *     <tr>
     *       <td>{10, 20, 30}</td>
     *       <td>20.0</td>
     *     </tr>
     *     <tr>
     *       <td>{5, 15, 25, 35}</td>
     *       <td>20.0</td>
     *     </tr>
     *   </tbody>
     * </table>
     *
     * @param numeros Um array de números inteiros.
     * @return A média aritmética dos números no array.
     * @throws IllegalArgumentException Se o array estiver vazio.
     */
    public double calcularMedia(int[] numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("O array não pode estar vazio.");
        }
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return (double) soma / numeros.length;
    }

    /**
     * ---------------------------------------------------------------------------------------
     */
    public void tabuada2(int numero) {
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

}



