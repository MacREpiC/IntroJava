package org.iesalandalus.programacion.introjava.variados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Reverso {
    public static void main(String[] args) {
        int numero;
        int reverso;
        reverso = 0;
        numero = -1;

        while (numero <= 0) {
            System.out.print("Introduce un número mayor que cero: ");
            numero = Entrada.entero();
        }
        while (numero > 0) {
            reverso = reverso * 10 + numero % 10;
            numero /= 10;
        }
        System.out.println("El reverso del número "+ numero + " es: "+ reverso);
    }
}
