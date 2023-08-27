package com.introduccion;

import java.util.Scanner;

public class introduccionEjercicio3 {
    /*
    Guillermo tiene N dolares. Luis tiene la mitad. Luis tiene la mitad de lo que posee Guillermo.
    Juan tiene la mita de lo que posee Luis y Guillermo juntos. Hacer un programa que calcule e
    imprima la cantidad de dinero que tienen entre los tres.
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan, total;
        System.out.print("Digite la cantidad de dolares que tiene Guillermo: ");
        guillermo = entrada.nextFloat();
        luis = guillermo/2;
        juan = (luis+guillermo)/2;
        total = guillermo + luis + juan;
        System.out.print("La cantidad de dinero que tienen entre Guillermo Luis y Juan es: " + total);
    }
}
