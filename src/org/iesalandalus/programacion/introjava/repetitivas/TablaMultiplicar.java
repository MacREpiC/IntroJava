package org.iesalandalus.programacion.introjava.repetitivas;

import org.iesalandalus.programacion.utilidades.Entrada;

public class TablaMultiplicar {
    public static void main(String[] args) {
        int numero;
        System.out.print("Dime un número: ");
        numero= Entrada.entero();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + numero * 1);
        }
    }
}
