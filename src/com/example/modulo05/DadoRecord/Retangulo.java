package com.example.modulo05.DadoRecord;

public record Retangulo(double altura, double largura) {

    public Retangulo() {
        this(4, 3);
    }

    public double calcularArea() {
        return largura * altura;
    }

    public static Retangulo create(double lado) {
        return new Retangulo(lado, lado);
    }
}