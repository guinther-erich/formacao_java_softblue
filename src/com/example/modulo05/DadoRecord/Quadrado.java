package com.example.modulo05.DadoRecord;

public record Quadrado(double lado) {

    public double calcularArea() {
        return lado * lado;
    }
}