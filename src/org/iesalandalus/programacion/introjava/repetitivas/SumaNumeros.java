package org.iesalandalus.programacion.introjava.repetitivas;

import org.iesalandalus.programacion.utilidades.Entrada;

public class SumaNumeros {
    public static void main(String[] args) {
        int numero;
        int suma;
        numero = 2;
        suma = 0;
        while (numero > 0) {
            System.out.print("Dime un número: ");
            numero = Entrada.entero();
            suma = numero + suma;
        }
        System.out.println("La suma de los números introducidos es: " + suma);
    }
}