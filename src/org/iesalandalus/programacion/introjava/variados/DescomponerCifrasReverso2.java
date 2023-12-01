package org.iesalandalus.programacion.introjava.variados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class DescomponerCifrasReverso2 {
    public static void main(String[] args) {
        int numero;
        int cifras;
        do{
            System.out.print("Dime un número mayor que cero:" );
            numero = Entrada.entero();
        } while (numero <= 0);

        int numCifras = (int) Math.log10(numero) + 1;
        for (int i = 0; i < numCifras; i++) {
            cifras = (int) (numero / Math.pow(10, i))%10;
            System.out.println(cifras);
        }
    }
}
