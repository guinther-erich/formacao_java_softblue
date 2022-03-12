package com.example.modulo05.ElementosEstaticos;

public class Aplicacao {

    public static void main(String[] args) {

        /* Matematica m = new Matematica();
        int soma = m.somar(6, 1);
        int subtracao = m.subtrair(19, 12); */

        int soma = Matematica.somar(6, 1);
        int subtracao = Matematica.subtrair(19, 12);

        System.out.println(soma);
        System.out.println(subtracao);

        System.out.println(Contador.getValor());

        Contador.incrementar();

        System.out.println(Contador.getValor());

        double media = Constantes.MEDIA;

        System.out.println(media);
    }
}
