package org.iesalandalus.programacion.misEjercicios;

import org.iesalandalus.programacion.utilidades.Entrada;

public class FactorialNumero {
    public static void main(String[] args) {
        int numero = -1;
        int factorial = 1;

        while (numero < 0) {
            System.out.print("Dime un número entero positivo: ");
            numero = Entrada.entero();
        }

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        System.out.println("El númeor factorial de " + numero + " es: " + factorial);
    }
}
