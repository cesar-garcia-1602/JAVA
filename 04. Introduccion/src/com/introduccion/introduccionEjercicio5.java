package com.introduccion;

import java.util.Scanner;

public class introduccionEjercicio5 {
    public static void main(String[] args) {
        /*
        La calificación final de un estudiante de informatica se calcula con base a la calificación de cuatro
        aspectos de su rendimiento academico: participación, primer examen parcial, segundo examen parcial y
        examen final. sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones
        del 10%, 25%, 25% y 40%. Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante.
        */
        Scanner entrada = new Scanner(System.in);
        double calificacion1, calificacion2, calificacion3, calificacion4, notafinal;
        System.out.print("Digite la calificación de participación: ");
        calificacion1 = entrada.nextDouble();
        System.out.print("Digite la calificación del primer examen parcial: ");
        calificacion2 = entrada.nextDouble();
        System.out.print("Digite la calificación del segundo examen parcial: ");
        calificacion3 = entrada.nextDouble();
        System.out.print("Digite la calificación del examen final: ");
        calificacion4 = entrada.nextDouble();
        notafinal = (calificacion1 * 0.1) + (calificacion2 * 0.25) + (calificacion3 * 0.25) + (calificacion4 * 0.4);
        System.out.println("La nota final es: " + notafinal);

    }

}
