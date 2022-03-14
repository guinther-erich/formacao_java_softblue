package com.example.modulo06.ConstrutorHeranca;

public class Veiculo {

    protected String marca;

    /*public Veiculo() {
        super();
        System.out.println("Veiculo()");
    }*/

    public Veiculo(String marca) {
        this.marca = marca;
        System.out.println("Veiculo(String)");
    }
}
