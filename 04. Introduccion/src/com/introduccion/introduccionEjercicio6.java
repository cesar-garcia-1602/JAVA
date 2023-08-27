package com.introduccion;

import java.util.Scanner;

public class introduccionEjercicio6 {
    public static void main(String[] args) {
        /*
        Hacer un programa que calcule el cuadrado de una suma
        (a+b)^2 = a^2 + 2ab + b^2
         */
        Scanner entrada = new Scanner(System.in);
        double a, b, cuadrado;
        System.out.print("Digite el primer numero (a): ");
        a = entrada.nextFloat();
        System.out.print("Digite el segundo numero (b): ");
        b = entrada.nextFloat();
        cuadrado = Math.pow(a,2) + 2*a*b + Math.pow(b,2);
        System.out.println("El resultado del cuadrado de la suma es: "+ cuadrado);    }
}
