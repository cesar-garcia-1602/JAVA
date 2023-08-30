package com.condicionales;

import javax.swing.*;

public class condicionalesEjercicio3 {
    public static void main(String[] args) {
        /*
        Hacer un programa que lea un caracter por teclado y compruebe si es una letra mayuscula
        */
        char letra;
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        if (Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
        }
        else{
            JOptionPane.showMessageDialog(null, "Es una letra minuscula");
        }
    }
}
