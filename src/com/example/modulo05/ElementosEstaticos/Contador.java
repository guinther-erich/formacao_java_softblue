package com.example.modulo05.ElementosEstaticos;

public class Contador {

    private static int valor;

    static {
        valor = 1;
    }

    public static void incrementar() {
        valor++;
    }

    public static int getValor() {
        return valor;
    }
}
