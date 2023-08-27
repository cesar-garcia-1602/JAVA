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
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero decimal: "));
        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: " + entero);
        JOptionPane.showMessageDialog(null, "El caracter es: " + letra);
        JOptionPane.showMessageDialog(null, "El numero decimal es: " + decimal);

    }
}
