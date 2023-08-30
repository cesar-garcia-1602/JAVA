package com.condicionales;

import javax.swing.*;

public class condicionalesEjercicio12 {
    public static void main(String[] args) {
        /*
        Pedir una nota entre 0 y 10 y mostrarla de la forma:
        - Insuficiente
        - Suficiente
        - Bien
        - Notable
        - Sobresaliente
        */
        int nota;

        nota= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nota del 0-10: "));

        switch(nota) {
            case 0:
            case 1:
            case 2:
                JOptionPane.showMessageDialog(null, "Nota insuficiente.");
                break;
            case 3:
            case 4:
                JOptionPane.showMessageDialog(null,"Nota suficiente.");
                break;
            case 5:
            case 6:
                JOptionPane.showMessageDialog(null,"Nota bien.");
                break;
            case 7:
            case 8:
                JOptionPane.showMessageDialog(null,"Nota Notable.");
                break;
            case 9:
            case 10:
                JOptionPane.showMessageDialog(null,"Nota Sobresaliente.");
                break;
            default:
                JOptionPane.showMessageDialog(null,"La nota tiene que ser de 0-10.");
        }
    }
}
