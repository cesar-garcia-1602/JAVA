package com.cesar;

import java.util.ArrayList;

public class Seleccion {
    //Variable -> Estado
    //Comportamiento -> Medotos

    // Tipos de dato sprimitivos
    // int, byte, short, log, float, double, boolean, char
    String nombreEquipo;
    char grupo;
    boolean clasificadoACuartos;

    void imprimirEquipo(){
        System.out.println(nombreEquipo);
        System.out.println(grupo);
        System.out.println(clasificadoACuartos);
    }


    public static void main(String[] args) {
        Seleccion argentina = new Seleccion();
        argentina.nombreEquipo = "Argentina";
        argentina.grupo = 'C';
        argentina.clasificadoACuartos = false;
        //argentina.imprimirEquipo();

        // if statement (bloque condicional)
        if(argentina.clasificadoACuartos == true){
            System.out.println("Clasificados");
        } else if (argentina.clasificadoACuartos == false) {
            System.out.println("Somos malisimos");
        }

        // bucle - loop

        // for - loop
        for(int i=1; i<11; i++){
            System.out.println("Asiento: " + i);
        }
        // while - loop
        int j = 1;
        while (j<11){
            System.out.println("Asiento: " + j);
            j++;
        }

        // Excepciones
        int x = 0;
        int z = 5;

        try {
            System.out.println(z / x);
        } catch (Exception exception) {
            System.out.println("Imposible dividir por cero");
        }

        //API
        ArrayList<String> selecciones = new ArrayList<>();
        selecciones.add("Francia");
        selecciones.add("Inglaterra");
        selecciones.add("Brasil");
        System.out.println(selecciones);
    }

}
