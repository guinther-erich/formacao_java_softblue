package com.example.modulo05.ModificadoresDeAcesso;

public class Aplicacao {

    public static void main(String[] args) {

        ContaBancaria c = new ContaBancaria();

        c.setNumConta(54334);
        c.setAtiva(true);

        c.depositar(5000);
        c.sacar(200);

        double saldo = c.getSaldo();
        System.out.println(saldo);
    }
}
