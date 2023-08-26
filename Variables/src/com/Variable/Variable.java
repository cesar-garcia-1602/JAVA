package com.Variable;

public class Variable {
    public static void main(String[] args) {
        // ******************* TIPO DE DATOS PRIMITIVOS *********************
        // byte, short, int, long
        byte entero = 12;
        System.out.println("Numero entero: " + entero);
        // float & double
        float decimal = 3.45F; // Siempre se debe poner una f
        System.out.println("Numero decimal: " + decimal);
        double decimal1 = 3.4525265;
        System.out.println("Numero decimal: " + decimal1);
        // char
        char caracter = 'a';
        System.out.println("Caracter: " + caracter);
        // Boolean
        boolean decision = true;
        System.out.println("La decisión es: " + decision);

        // ************** TIPO DE DATOS NO PRIMITIVOS Y CADENAS **************
        Integer numero = null;
        System.out.println("Numero entero: " + numero);
        String palabra = "Hola que tal?";
        System.out.println(palabra);


    }
}
