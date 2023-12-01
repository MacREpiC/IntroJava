package org.iesalandalus.programacion.introjava.variados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class NumeroPerfecto {
    public static void main(String[] args) {
        int numero;
        int contador;
        contador = 0;
        numero = -1;
        while (numero < 0) {
            System.out.print("Dime un número: ");
            numero = Entrada.entero();
        }
        for (int i = 1; i <=numero-1; i++){
            if (numero%i ==0){
                contador += i;
            }
        }
        if (contador == numero) {
            System.out.println("El número es perfecto!");
        } else {
            System.out.println("El número no es perfecto.");
        }

    }
}
