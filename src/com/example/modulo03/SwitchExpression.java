package com.example.modulo03;

public class SwitchExpression {

    public enum DiaDaSemana {
        DOMINGO,
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO
    }

    public static void main(String[] args) {

        DiaDaSemana d = DiaDaSemana.DOMINGO;

        switch (d) {
            case DOMINGO : System.out.println(1); break;
            case SEGUNDA : System.out.println(2); break;
            case TERCA : System.out.println(3); break;
            case QUARTA : System.out.println(4); break;
            case QUINTA : System.out.println(5); break;
            case SEXTA : System.out.println(6); break;
            case SABADO : System.out.println(7); break;
        }

        DiaDaSemana d2 = DiaDaSemana.DOMINGO;

        switch (d2) {
            case DOMINGO -> System.out.println(1);
            case SEGUNDA -> System.out.println(2);
            case TERCA -> System.out.println(3);
            case QUARTA -> System.out.println(4);
            case QUINTA -> System.out.println(5);
            case SEXTA -> System.out.println(6);
            case SABADO -> System.out.println(7);
        }

        int i = switch (d) {
            case DOMINGO -> 1;
            default -> 0;
        };
    }
}
