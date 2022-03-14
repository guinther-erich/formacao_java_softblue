package com.example.modulo06.Polimorfismo;

public class Cachorro extends Animal {

    @Override
    public void falar() {
        System.out.println("AU-AU");
    }

    public void morder() {
        System.out.println("NHAC!");
    }
}
