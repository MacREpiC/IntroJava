package org.iesalandalus.programacion.misEjercicios;

import org.iesalandalus.programacion.utilidades.Entrada;

public class SumaDigitos {
    public static void main(String[] args) {
        int numero = -1;
        int suma = 0;

        while (numero != 0) {
            System.out.print("Dime un número: ");
            numero = Entrada.entero();

            suma = suma + numero;
        }
        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
