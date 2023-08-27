package com.condicionales;

import javax.swing.*;

public class sentenciaIfElse {
    public static void main(String[] args) {
        /*
        if(condicion){
            instrucción1;
        }
        else{
            instrucción2;
        }
        */
        int numero, dato=5;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        if (numero == dato){
            JOptionPane.showMessageDialog(null, "El numero es 5");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero es diferete de 5");
        }
    }
}
