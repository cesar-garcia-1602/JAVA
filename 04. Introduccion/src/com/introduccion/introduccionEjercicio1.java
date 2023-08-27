package com.introduccion;

import java.util.Scanner;

public class introduccionEjercicio1 {
    public static void main(String[] args) {
        /*
        Hacer un programa que calcule e imprima la suma de tres calificaciones.
        */
        Scanner entrada = new Scanner(System.in);

        double calificacion1, calificacion2, calificacion3, suma;
        System.out.print("Digite la 1° calificación: ");
        calificacion1 = entrada.nextDouble();
        System.out.print("Digite la 2° calificación: ");
        calificacion2 = entrada.nextDouble();
        System.out.print("Digite la 3° calificación: ");
        calificacion3 = entrada.nextDouble();
        suma = calificacion1 + calificacion2 + calificacion3;
        System.out.println("La suma de las 3 calificaciones es: " + suma);
    }
}
