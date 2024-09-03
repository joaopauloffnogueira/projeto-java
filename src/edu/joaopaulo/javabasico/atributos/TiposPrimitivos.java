package edu.joaopaulo.javabasico.atributos;


public class TiposPrimitivos {

    /**
     * <h3>Tipos primitivos para númeos inteiros:</h3>
     *
     * <li><strong>byte:</strong> possui um limite de 127 postivio e 128 negativo</li>
     * <li><strong>short:</strong> possui um limite de 32.767</li>
     * <li><strong>int:</strong>   possui um limite de 2.147.483.647</li>
     * <li><strong>long:</strong>  possui um limite de 9.223.372.036.854.775.807L.</li>
     *
     * <br>
     *
     * <i>Obs: O tipo long precisa inserir a letra L ao final do valor..</i>
     */
    byte numerosByte = 127;
    short numerosCurto = 32_767;
    int numerosInteiros = 2_147_483_647;
    long numerosLongos = 9_223_372_036_854_775_807L;


    /**
     * <h3>Tipos primitivos para númeos decimais:</h3>
     *
     * <li><strong>float:</strong> Usado para calculos ou armazenamento simples</li>
     * <li><strong>double:</strong> Usado para calculos avançados como contábeis ou cinetífico</li>
     *
     * <br>
     *
     * <i>Obs: O tipo float precisa inserir a letra F ao final do valor.</i>
     */
    float numerosFloat = 3.4F;
    double numerosDouble = 21.45;


    /**
     * <h3>Inserindo Textos:</h3>
     *
     * <i>Obs: String não é um tipo primitivo, no java ele é uma classe.</i>
     *
     * <br>
     *
     * <li><strong>String: </strong> Use aspas Duplas para inserir o texto</li>
     * <li><strong>char: </strong> Apenas usado para caracteres (A,B,C,D ect...), use aspas simples</li>
     */
    String texto = "texto qualquer";
    char letra = 'A';

    /**
     * <h3>Tipo boolean:</h3>
     *
     * <br>
     *
     * <li><strong>true: </strong> Define o valor como verdadeiro</li>
     * <li><strong>false: </strong> Define o valor como falso</li>
     */

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
