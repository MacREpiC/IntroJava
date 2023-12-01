package org.iesalandalus.programacion.introjava.secuenciales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Cuadrado {
    public static void main(String[] args) {
        double numero;
        System.out.print("Introduce un número: ");
        numero = Entrada.realDoble();
        System.out.println("El cuadrado del número " + numero + " es " + numero * numero);
    }
}
