package org.iesalandalus.programacion.introjava.repetitivas;

import org.iesalandalus.programacion.utilidades.Entrada;

public class NumeroPositivo {
    public static void main(String[] args) {
        int numero;
        numero = -1;
        while (numero < 0) {
            System.out.print("Dime un número: ");
            numero = Entrada.entero();
        }
        System.out.print("Has introducido un número positivo!");
    }
}
