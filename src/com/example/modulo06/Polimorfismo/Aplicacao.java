package com.example.modulo06.Polimorfismo;

public class Aplicacao {

    public static void main(String[] args) {

        Animal a = new Cachorro();

        a.falar();
        // a.morder(); -> não existe porque o Cachorro devia ser instanciado

        if (a instanceof Cachorro) {
            Cachorro au = (Cachorro) a;
            au.morder();
        }

        Cachorro c = new Cachorro();
        c.morder();

        Cachorro c2 = new Cachorro();
        Gato g = new Gato();

        falar(c);
        falar(g);
    }

    private static void falar(Animal a1) {
        a1.falar();
    }
}
