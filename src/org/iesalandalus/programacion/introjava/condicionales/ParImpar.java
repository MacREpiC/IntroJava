package org.iesalandalus.programacion.introjava.condicionales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class ParImpar {
    public static void main(String[] args) {
        int numero;
        System.out.print("Dime un número:" );
        numero = Entrada.entero();
        if (numero % 2 == 0) {
            System.out.print("El número es par!");
        } else {
            System.out.print("El número es impar");
        }
    }
}
