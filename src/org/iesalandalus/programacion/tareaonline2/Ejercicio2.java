package org.iesalandalus.programacion.tareaonline2;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero = 0;
        int operacion = 0;

        while (numero < 1 || numero > 9) {
            System.out.print("Dime un número entre 1 y 9: ");
            numero = Entrada.entero();
        }

        for (int i = 1; i <= numero; i++) {
            operacion = operacion * 10 + i;
            System.out.println("8 * " + operacion + " + " + i + " = " + (8 * operacion + i));
        }
    }
}