package com.example.modulo03;

public class TrabalhandoComVariaveis {
    public static void main(String[] args) {

        /* int numero;
        numero = 51; */

        int numero = 51;
        int numero2 = numero + 9;

        // numero2 = numero2 - 1;
        // numero2 -= 1;
        numero2--;

        System.out.println(numero);
        System.out.println(numero2);

        boolean b = true;

        System.out.println(b);

        // int i = 10L + 5; <- errado
        long l = 10L + 5;

        System.out.println(l);

        // int d = 5 * 2.0; <- errado
        double d = 5 * 2.0;

        System.out.println(d);

        // int divisao = 0 / 0; <- erro de aritmética
        // int divisao = 0.0 / 0; <- erro de tipagem
        // double divisao = 0.0 / 0; <- erro NaN
        double divisao = 10.0 / 0; // infinity

        System.out.println(divisao);
    }
}
