package com.condicionales;

import javax.swing.*;

public class condicionalesEjercicio2 {
    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
        if (num1 < num2){
            JOptionPane.showMessageDialog(null, "El numero " + num1 + " es menor que el numero " + num2);
        }
        else if (num1 > num2){
            JOptionPane.showMessageDialog(null, "El numero " + num1 + " es mayor que el numero" + num2);
        }
        else{
            JOptionPane.showMessageDialog(null, "Los dos numeros son iguales");
        }
    }
}
