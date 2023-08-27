package com.introduccion;

import java.util.Scanner;

public class introduccionEjercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horasTotales, semanas, dias, horas;
        System.out.print("Digite la cantidad de horas: ");
        horasTotales = entrada.nextInt();
        semanas = horasTotales/(24*7);
        dias = horasTotales%(24*7) / 24;
        horas = horasTotales%24;
        System.out.print("El equivalente es: " + semanas + " semanas " + dias + " dias" + " y " + horas + " horas");
    }
}
