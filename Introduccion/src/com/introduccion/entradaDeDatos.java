package com.introduccion;

import java.util.Scanner;

public class entradaDeDatos {
    public static void main(String[] args) {
        // Entrada de datos
        Scanner entrada = new Scanner(System.in);

        int num;
        System.out.print("Digite un numero: ");
        num = entrada.nextInt();
        System.out.println("El numero es: " + num);
    }
}
