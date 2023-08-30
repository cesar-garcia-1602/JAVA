package com.condicionales;

import javax.swing.*;

public class condicionalesEjercicio4 {
    public static void main(String[] args) {
        /*
        En Megaplaza se hace un 20% de descuento a los clientes cuya compra supere
        los $300. ¿Cual será la cantidad que pagará una persona por su compra?
        */
        double valorCompra, valorFinal;
        valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la compra: "));
        valorFinal = valorCompra * 0.8;
        if (valorCompra > 300){
            JOptionPane.showMessageDialog(null, "El valor a pagar es " + valorFinal);
        }
        else{
            JOptionPane.showMessageDialog(null, "El valor a pagar es " + valorCompra);
        }
    }
}
