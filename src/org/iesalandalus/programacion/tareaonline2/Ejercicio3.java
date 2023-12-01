package org.iesalandalus.programacion.tareaonline2;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numero = -1;
        int digito = 0;
        int sumaCubos = 0;

         while (numero < 0 || numero > 999) {
             System.out.print("Dime un número positivo que tenga tres cifras: ");
             numero = Entrada.entero();
         }
        int narcisista = numero;

         while (numero > 0) {
             digito = numero % 10;
             sumaCubos += (int) Math.pow(digito, 3);
             numero /= 10;
         }

         if (narcisista == sumaCubos) {
             System.out.println("El número " + narcisista + " es narcisista.");
         } else {
             System.out.println("El número " + narcisista + " no es narcisista.");
         }
    }
}
