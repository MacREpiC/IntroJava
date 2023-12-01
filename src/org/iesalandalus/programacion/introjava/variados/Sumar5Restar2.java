package org.iesalandalus.programacion.introjava.variados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Sumar5Restar2 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int aux;
        num1 = -1;
        num2 = -1;

        while (num1 < 0 || num1 > 50) {
            System.out.print("Introduce el primer número entre 0 y 50: ");
            num1 = Entrada.entero();
        }
        while (num2 < 0 || num2 > 50) {
            System.out.print("Introduce el segundo número entre 0 y 50: ");
            num2 = Entrada.entero();
        }
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        while (num1 < num2) {
            System.out.println("N1: " + num1 + ", N2: " + num2);
            num1 += 5;
            num2 -= 2;
        }
    }
}
