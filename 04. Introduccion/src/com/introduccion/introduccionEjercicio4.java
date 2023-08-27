package com.introduccion;

import java.util.Scanner;

public class introduccionEjercicio4 {
    /*
    Una compañia de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales, mas una comisión
    de $150 por cada carro vendido, más el 5% del valor de la venta por carro. Cada mes el capturista de la empresa ingresa
    en la computadora los datos pertinentes. Hacer un programa que calcule e imprima el salario mensual de un vendedor dado
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombreVenderor;
        int cantidadDeVentas;
        float valorDeVentasTotales;
        final int salario = 1000;
        final int comision = 150;
        double salarioTotal;
        System.out.print("Digite el nombre del vendedor: ");
        nombreVenderor = entrada.next();
        System.out.print("Digite la cantidad de ventas de " + nombreVenderor + ": ");
        cantidadDeVentas = entrada.nextInt();
        System.out.print("Digite el valor de las ventas totales de " + nombreVenderor + ": ");
        valorDeVentasTotales = entrada.nextFloat();
        salarioTotal = salario + (cantidadDeVentas * comision) + (valorDeVentasTotales * 0.05);
        System.out.println("El salario de " + nombreVenderor + " es: " + salarioTotal);
    }

}
