package org.iesalandalus.programacion.introjava.variados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class NumCifras {
    public static void main(String[] args) {
        int numero;
        int cifras;
        cifras = 0;
        numero = -1;
        while (numero < 0) {
            System.out.print("Dime un número: ");
            numero = Entrada.entero();
        }
        while (numero>1) {
            numero = numero /10;
            cifras = cifras + 1;
        }
        System.out.println("El número posée "  + cifras + " cifras");
    }
}
