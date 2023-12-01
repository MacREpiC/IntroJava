package org.iesalandalus.programacion.misEjercicios;

import org.iesalandalus.programacion.utilidades.Entrada;

public class DecimalBinario {
    public static void main(String[] args) {
        int numero= -1;
        int cifras = 0;
        int division = 0;
        int numeroDecimal = 0;
        int posicion = 1;

        while (numero < 0){
            System.out.print("Dime un número: " );
            numero = Entrada.entero();
        }

        numeroDecimal = numero;

        while (numero >= 2) {
            division = numero % 2;
            cifras = cifras + division * posicion;
            numero = numero / 2;
            posicion = posicion * 10;
        }
        System.out.println("El número " + numeroDecimal + " a binario es: " + cifras);
    }
}
