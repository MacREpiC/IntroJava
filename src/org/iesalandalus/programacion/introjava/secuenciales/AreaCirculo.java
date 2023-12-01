package org.iesalandalus.programacion.introjava.secuenciales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class AreaCirculo {
    public static void main(String[] args) {
        double radio;
        System.out.print("Dime el rádio del cuadrado: ");
        radio = Entrada.real();
        double perimetro = Math.PI * (2 * radio);
        System.out.println("El perimetro del círculo es: " + perimetro);

    }
}
