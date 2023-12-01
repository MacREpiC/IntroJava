package org.iesalandalus.programacion.introjava.variados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class ReversoSinModificar {
    public static void main(String[] args) {
        int numero = -1;
        int posicionCifra;
        int reverso;
        posicionCifra = 0;
        reverso = 0;

        while (numero <= 0) {
            System.out.print("Introduce un número mayor que cero: ");
            numero = Entrada.entero();
        }
        while (numero / (int) Math.pow(10, posicionCifra) > 0) {
            reverso = reverso * 10 + numero / (int) Math.pow(10, posicionCifra) % 10;
            posicionCifra++;
        }
        System.out.println("El reverso del número " + numero + " es: " + reverso);
    }
}
