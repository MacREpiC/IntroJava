// Alejandro Melero Zhohal 1 DAW
//
package org.iesalandalus.programacion.examen;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numeroBinario = -1;
        int cifra = 0;
        int numeroDecimal = 0;

        while (numeroBinario < 0) {
            System.out.print("Dime un número binario positivo: ");
            numeroBinario = Entrada.entero();
        }
        if (cifra != 0 || cifra != 1){
            System.out.print("Dime un número binario positivo: ");
            numeroBinario = Entrada.entero();
        }
        int numeroBinarioParaFinal = numeroBinario;

        int posicionCifra = (int) Math.log10(numeroBinario);
        for (int i = posicionCifra; i >= 0; i--) {
            cifra = (int) (numeroBinario / Math.pow(10, i))%10;

            cifra = (int) (cifra * Math.pow(2, i));
            numeroDecimal = numeroDecimal + cifra;
        }

        System.out.println("El número " + numeroBinarioParaFinal + " a decimal es " + numeroDecimal);
    }
}