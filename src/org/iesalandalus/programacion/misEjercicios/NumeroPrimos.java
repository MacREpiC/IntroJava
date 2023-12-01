package org.iesalandalus.programacion.misEjercicios;

import org.iesalandalus.programacion.utilidades.Entrada;

public class NumeroPrimos {

    public static void main(String[] args) {
        int numero = -1;
        int resto = 0;

        while (numero < 1) {
            System.out.print("Dime un número entero: ");
            numero = Entrada.entero();
        }

        for (int i = 2; i < numero && resto != 0; i++) {
            resto = numero % i;
        }

        if (resto > 0) {
            System.out.println("El número no es primo");
        } else {
            System.out.println("El número es primo");
        }
    }
}
