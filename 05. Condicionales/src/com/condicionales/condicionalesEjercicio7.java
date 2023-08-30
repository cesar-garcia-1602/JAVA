package com.condicionales;

import javax.swing.*;

public class condicionalesEjercicio7 {
    public static void main(String[] args) {
        /*
        Pedir 3 numeros y mostrarlos ordenados de mayor a menor
        */
        
        float num1, num2, num3;
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el primer numero: "));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el segundo numero: "));
        num3 = Float.parseFloat(JOptionPane.showInputDialog("Digite el tercer numero: "));
        if ((num1 > num2) && (num2>num3)){
            JOptionPane.showMessageDialog(null, "Orden: " +num1+ "-" +num2+ "-" +num3);
        } else if ((num1 > num3) && (num3 > num2)) {
            JOptionPane.showMessageDialog(null, "Orden: " +num1+ "-" +num3+ "-" +num2);
        } else if ((num2 > num1) && (num1 > num3)) {
            JOptionPane.showMessageDialog(null, "Orden: " +num2+ "-" +num1+ "-" +num3);
        } else if ((num2 > num3) && (num3 > num1)) {
            JOptionPane.showMessageDialog(null, "Orden: " +num2+ "-" +num3+ "-" +num1);
        } else if ((num3 > num1) && (num1 > num2)) {
            JOptionPane.showMessageDialog(null, "Orden: " +num3+ "-" +num1+ "-" +num2);
        } else{
            JOptionPane.showMessageDialog(null, "Orden: " +num3+ "-" +num2+ "-" +num1);
        }

    }
}
