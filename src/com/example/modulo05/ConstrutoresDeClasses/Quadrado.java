package com.example.modulo05.ConstrutoresDeClasses;

public class Quadrado {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}
