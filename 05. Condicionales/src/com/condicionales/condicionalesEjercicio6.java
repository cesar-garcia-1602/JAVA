package com.condicionales;

import javax.swing.*;

public class condicionalesEjercicio6 {
    public static void main(String[] args) {
        /*
        Hacer un programa que tome dos numeros y diga si ambos son pares o impares.
        */
        int numero1, numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero; "));
        if(numero1%2==0 && (numero2%2==0)){
            JOptionPane.showMessageDialog(null, "Ambos números son pares");
        }
        else if(!(numero1%2==0) && !(numero2%2==0)){
            JOptionPane.showMessageDialog(null, "Ambos números son impares");
        }
        else{
            JOptionPane.showMessageDialog(null, "Los dos números No son pares o No son impares a la vez");
        }
    }
}
