package com.introduccion;

import javax.swing.*;

public class entradaYSalidaDeDatosConJOptionPane {
    public static void main(String[] args) {
        // Entrada y salida de datos con JOptionPane
        String cadena;
        int entero;
        char letra;
        double decimal;
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        System.out.println(cadena);
    }
}
