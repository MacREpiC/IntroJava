package org.iesalandalus.programacion.introjava.secuenciales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Doble {

    public static void main(String[] args) {
        float numero;
        System.out.print("Introduce un número:");
        numero = Entrada.real();
        System.out.println("El doble del número del número " + numero + " es " + 2 * numero);
    }
}
