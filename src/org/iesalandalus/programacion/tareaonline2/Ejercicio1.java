package org.iesalandalus.programacion.tareaonline2;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero;
        numero = -1;
        int numeroOctal = 0;
        int posicion = 1;
        int digitoOctal = 0;
        int octal = 0;

        while (numero < 0) {
            System.out.print("Dime un número positivo: ");
            numero = Entrada.entero();
        }

        octal = octal + numero;

        while (numero > 0) {
            digitoOctal = numero % 8;
            numeroOctal = digitoOctal * posicion + numeroOctal;
            numero = numero / 8;
            posicion = posicion * 10;
        }

        // Mostrar el número en formato octal
        System.out.println("El número octal de " + octal + " es: " + numeroOctal);
    }
}
