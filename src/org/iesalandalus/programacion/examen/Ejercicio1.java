// Alejandro Melero Zhohal 1 DAW
package org.iesalandalus.programacion.examen;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero = 0;

        while (numero < 100 || numero > 9999) {
            System.out.print("Introduce un número positivo de tres o cuatro cifras: ");
            numero = Entrada.entero();
        }
        int paraElFinal = numero;
        int paraLaSegundaParte = numero;

        int primeraParte = numero / 10;
        System.out.println(primeraParte);

        int segundaParte = paraLaSegundaParte % 10;
        System.out.println(segundaParte);

        int cantidadCifras = (int) Math.log10(numero);
        int aislarUltimaCifra = segundaParte * (int) Math.pow(10, cantidadCifras);
        System.out.println(aislarUltimaCifra);

        int sumaFinal = aislarUltimaCifra + primeraParte;

        System.out.println("El número " + paraElFinal + " desplazado hacia la derecha es: " + sumaFinal);
    }
}