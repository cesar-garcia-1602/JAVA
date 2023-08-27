package com.introduccion;

import java.util.Scanner;

public class introduccionEjercicio2 {
    public static void main(String[] args) {
        /*
        Hacer un programa que calcule e imprima el salario semanal de un empleado
        a partir de sus horas semanales trabajadas y de su salario por hora
        */
        double horas, salarioPH, salarioSem;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite la cantidad de horas trabajadas: ");
        horas = entrada.nextDouble();
        System.out.print("Digite el valor de salario por hora: ");
        salarioPH = entrada.nextDouble();
        salarioSem = horas*salarioPH;
        System.out.println("El salario semanal del empleado es: " + salarioSem);

    }
}
