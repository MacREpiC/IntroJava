package org.iesalandalus.programacion.introjava.condicionales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class CeroCien {
    public static void main(String[] args) {
        int numero;
        System.out.print("Dime un número: ");
        numero = Entrada.entero();

        if (numero >= 0 && numero <= 100) {
            System.out.println("El número está entre 0 y 100");
        } else {
            System.out.println("El número no está entre 0 y 100");
        }
    }
}
