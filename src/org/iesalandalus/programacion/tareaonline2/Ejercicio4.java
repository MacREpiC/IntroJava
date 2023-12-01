package org.iesalandalus.programacion.tareaonline2;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio4 {
    public static void main(String[] args) {
        double notaFebrero = -1;
        double notaEnero = -1;

        //Pedir nota febrero
        while (notaFebrero < 0 || notaFebrero > 10) {
            System.out.print("Dime la nota de febrero: ");
            notaFebrero = Entrada.realDoble();
        }

        //Pedir nota enero
        while (notaEnero < 0 || notaEnero > 10) {
            System.out.print("Dime la nota de enero: ");
            notaEnero = Entrada.realDoble();
        }

        double media = (notaFebrero * 40 /100) + (notaEnero * 60 /100);

        if (notaFebrero >= 4 && notaEnero >= 4) {
            System.out.println("La nota final es: " + media);
        }

        if (notaFebrero < 4 || notaEnero < 4) {
            if (media < 4){
                System.out.println("La nota final es: " + media);
            } else {
                System.out.println("La nota final es: " + 4);
            }
        }
        System.out.println();
    }
}
