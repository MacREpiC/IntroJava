package org.iesalandalus.programacion.introjava.condicionales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class PositivoNegativo {
    public static void main(String[] args) {
        int numero;
        System.out.print("Dime un número: ");
        numero = Entrada.entero();
        if (numero>=0){
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
    }
}
