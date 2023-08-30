package com.condicionales;

import javax.swing.*;

public class condicionalesEjercicio11 {
    public static void main(String[] args) {
        /*
        Construir un programa que simule el funcionamiento de una calculadora que puede realizar las
        cuatro operaciones aritmeticas basicas (suma, resta, multiplicación y division) con valores
        numericos enteros. El usuario debe especificar la operación con el primer caracter del primer
        parametro de la linea de comandos: S o s para la suma, R o r para la resta, P, p, M o m para
        el producto y D o d para la división.
        */
        int num1, num2, suma, resta, multiplicacion, division;
        char operacion;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
        operacion = JOptionPane.showInputDialog("Digite la operación que desea realizar: ").charAt(0);
        switch (operacion){
            case 's':
            case 'S':
                suma = num1 + num2;
                JOptionPane.showMessageDialog(null, "La suma es: " + suma);
                break;
            case 'r':
            case 'R':
                resta = num1 - num2;
                JOptionPane.showMessageDialog(null, "La resta es: " + resta);
                break;
            case 'p':
            case 'P':
            case 'm':
            case 'M':
                multiplicacion = num1 * num2;
                JOptionPane.showMessageDialog(null, "La multiplicación es: " + multiplicacion);
                break;
            case 'd':
            case 'D':
                division = num1 / num2;
                JOptionPane.showMessageDialog(null, "La división es: " + division);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error se equivoco de operación: ");
                break;
        }
    }
}
