package edu.joaopaulo.javabasico.estruturascondicionais;

public class ResultadoEscolar {
    public static void main(String[] args) {

        int valorNota = 70;
        char notaConceitual;

        if (valorNota >= 90) {
            notaConceitual = 'A';
        } else if (valorNota >= 80) {
            notaConceitual = 'B';
        } else if (valorNota >= 70) {
            notaConceitual = 'C';
        } else if (valorNota >= 60) {
            notaConceitual = 'D';
        } else {
            notaConceitual = 'F';
        }

        switch (notaConceitual) {
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
                System.out.println("Valor inserido incorretamente!");
        }



//        String resultado = nota >= 70 ? "Aprovado" : nota >= 60 ? "Recuperação" : "Reprovado";
//        System.out.println(resultado);

    }
}
