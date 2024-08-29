package edu.joaopaulo.javabasico.atributos;

import org.w3c.dom.ls.LSOutput;
import java.util.Date;

public class TiposPrimitivos {

    // -- Tipos primitivos para números inteiros:
    byte numerosByte = 127;
    short numerosCurto = 32_767;
    int numerosInteiros = 2_147_483_647;
    long numerosLongos = 9_223_372_036_854_775_807L;

    // ---------------------------------------------

    // -- Tipos primitivos para números fracionados:
    float numerosFloat = 3.4F;
    double numerosDouble = 21.45;

    // -- Inserir textos
    // Obs: String não é um tipo primitivo, no java ele é uma classe.
    String texto = "texto qualquer";

    // -- Tipo primitivo boolean:
    boolean verdadeiro = true;
    boolean falso = false;

    // Exemplo:
    String nome = "João Paulo";
    int idade = 28;
    double peso = 68.5;
    char sexo = 'M';
    boolean doadorOrgao = false;
    Date dataNascimento = new Date();
}
