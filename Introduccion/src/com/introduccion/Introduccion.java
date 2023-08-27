package com.introduccion;

import java.util.Scanner;

public class Introduccion {
    public static void main(String[] args) {
        // ********* CONSTANTES *********
        final int numero = 10; //Constante
        System.out.println(numero);

        // ********* ENTRADA DE DATOS *********
        Scanner entrada = new Scanner(System.in);

        int num;
        System.out.print("Digite un numero: ");
        num = entrada.nextInt();
        System.out.println("El numero es: " + num);
    }
}
