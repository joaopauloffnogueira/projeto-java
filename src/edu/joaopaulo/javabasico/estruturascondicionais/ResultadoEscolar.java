package edu.joaopaulo.javabasico.estruturascondicionais;

public class ResultadoEscolar {
    public static void main(String[] args) {
        //int nota = 7;

        /*
        if (nota >= 7){
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7){
            System.out.println("Recuperação");
        } else{
            System.out.println("Reprovado");
        }


        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

        */

        // ---------------------------------

        int valorNota = 10;
        char nota;

        // Exemplo 1 usando operador ternário:
        nota = valorNota >= 9 ? 'A' : valorNota < 9 && valorNota >= 8 ? 'B' : valorNota < 8 && valorNota >= 7 ? 'C' : valorNota < 7 && valorNota >= 6 ? 'D' : 'F';
        // Nesse caso, não é recomendado pelo de ter muitas condições, só deve ser usando quando houver poucas condições.

        // Exemplo 2 usando if e else:
        if (valorNota >= 9){
            nota = 'A';
        } else if (valorNota < 9 && valorNota >= 8) {
            nota = 'B';
        } else if (valorNota < 8 && valorNota >= 7) {
            nota = 'C';
        } else if (valorNota < 7 && valorNota >= 6) {
            nota = 'D';
        } else {
            nota = 'F';
        }
        // Nesse caso, o if/else se sair melhor pois consegue deixar o código mais legivel.

        // Exemplo 3, melhorando o if/else
        if (valorNota >= 9) {
            nota = 'A';
        } else if (valorNota >= 8) {
            nota = 'B';
        } else if (valorNota >= 7) {
            nota = 'C';
        } else if (valorNota >= 6) {
            nota = 'D';
        } else {
            nota = 'F';
        }
        // Sempre conseguimos melhorar a logica do código e diminuir sua complexibilidade.




        // Após o resultado condicional, é passo o resultado para o Switch fazer a codição para exibir a resposta.
        switch (nota){
            case 'A':
                System.out.println("Nota A (Excelente) - Aprovado, valor da nota: " + valorNota);
                break;
            case 'B':
                System.out.println("Nota B (Bom) - Aprovado, valor da nota: " + valorNota);
                break;
            case 'C':
                System.out.println("Nota C (Satisfatório) - Aprovado, valor da nota: " + valorNota);
                break;
            case 'D':
                System.out.println("Nota D (Abaixo do Esperado) - Recuperação, valor da nota: " + valorNota);
                break;
            case 'F':
                System.out.println("Nota F - Reprovado, valor da nota: " + valorNota);
                break;
            default:
                System.out.println("Valor inserido incorretamente!!");
        }




    }
}
