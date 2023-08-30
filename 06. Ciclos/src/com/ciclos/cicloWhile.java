package com.ciclos;

import java.util.Scanner;

public class cicloWhile {
    public static void main(String[] args) {
        /*
        while (condicion){
            instrucciones;
        }
        */
        Scanner entrada = new Scanner(System.in);
        int i = 1, contador;
        System.out.print("Digite cuantos numeros quiere en pantalla: ");
        contador = entrada.nextInt();
        while (i <= contador){
            System.out.println(i);
            i++;
        }
    }
}
