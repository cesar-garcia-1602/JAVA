package com.introduccion;

import java.math.RoundingMode;

public class claseMath {

    public static void main(String[] args) {
        double raiz = 9.0;
        System.out.println(Math.sqrt(raiz));

        double base = 5, exponente = 2;
        double resultado = Math.pow(base, exponente);
        System.out.println(resultado);

        double numero = 4.699875;
        long resultado2 = Math.round(numero);
        System.out.println(resultado2);

        double numero1 = Math.random();
        System.out.println(numero1);

    }
}
