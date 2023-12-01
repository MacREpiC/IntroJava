package org.iesalandalus.programacion.introjava.condicionales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class NumerosIguales {
    public static void main(String[] args) {
        int num1;
        int num2;
        System.out.print("Introduce el primer número: ");
        num1 = Entrada.entero();

        System.out.print("Intoduce el segundo número: ");
        num2 = Entrada.entero();

        if (num1==num2){
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Los numeros no son iguales.");
        }
    }
}
