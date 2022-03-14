package com.example.modulo06.PolimorfismoBebida;

public class Bebida {

    private String nome;
    private boolean quente;

    public Bebida(String nome, boolean quente) {
        this.nome = nome;
        this.quente = quente;
    }

    public String getNome() {
        return nome;
    }

    public boolean isQuente() {
        return quente;
    }

    public void preparar() {

    }
}
