package com.example.modulo04.Sobrecarga;

public class Aplicacao {

    public static void main(String[] args) {

        Matematica m = new Matematica();

        int soma = m.somar(10,20);

        System.out.println(soma);

        int soma2 = m.somar(10,20, 30);

        System.out.println(soma2);

        double soma3 = m.somar(10.0,20.9);

        System.out.println(soma3);

        double soma4 = m.somar(10,20.9);

        System.out.println(soma4);
    }
}
