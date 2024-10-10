package edu.joaopaulo.javabasico.desafios.projetocontador;

// Classe de tratamento de Exceções
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String messagem){
        super(messagem);
    }
}
