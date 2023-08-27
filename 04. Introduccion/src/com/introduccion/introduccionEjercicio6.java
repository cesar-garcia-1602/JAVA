package com.introduccion;

import java.util.Scanner;

public class introduccionEjercicio6 {
    public static void main(String[] args) {
        /*
        Hacer un programa que calcule el cuadrado de una suma
        (a+b)^2 = a^2 + 2ab + b^2
         */
        Scanner entrada = new Scanner(System.in);
        double num1, num2, cuadrado;
        System.out.print("Digite el primer numero: ");
        num1 = entrada.nextFloat();
        System.out.print("Digite el segundo numero: ");
        num2 = entrada.nextFloat();
        cuadrado = Math.pow(num1,2) + 2*num1*num2 + Math.pow(num2,2);
        System.out.println("El resultado del cuadrado de la suma es: "+ cuadrado);    }
}
