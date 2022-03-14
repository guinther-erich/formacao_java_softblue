package com.example.modulo06.Heranca;

public class Aplicacao {

    public static void main(String[] args) {

        Veiculo v = new Veiculo();
        v.setMarca("AAA");
        v.setModelo("TIPOX");
        v.setAno(1993);

        v.imprimirDados();
        v.buzinar();

        Carro c = new Carro();
        c.setMarca("CARROOM");
        c.setModelo("4RODA");
        c.setAno(1996);
        c.setQuatroPortas(false);

        c.imprimirDados();
        c.buzinar();

        Motocicleta m = new Motocicleta();

        m.buzinar();
        m.empinar();

        Caminhao cam = new Caminhao();

        cam.buzinar();
    }
}
