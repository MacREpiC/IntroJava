package org.iesalandalus.programacion.introjava.repetitivas;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MediaNumeros {
    public static void main(String[] args) {
        int numero;
        int suma;
        int contador;
        contador = 0;
        numero = 1;
        suma = 0;
        while (numero > 0) {
            System.out.print("Dime un número: ");
            numero = Entrada.entero();
            suma = numero + suma;
            contador++;
        }
        System.out.println("La media de los números introducidos es: " + suma / (contador-1));
    }
}
