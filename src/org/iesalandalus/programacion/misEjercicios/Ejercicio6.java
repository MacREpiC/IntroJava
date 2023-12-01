package org.iesalandalus.programacion.misEjercicios;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio6 {

    public static void main(String[] args) {
        int numero;
        int cifra;
        numero = -1;
        while (numero <= 0) {
            System.out.print("Introduce un número mayor que cero: ");
            numero = Entrada.entero();
        }
        int posicionCifra = (int) Math.log10(numero);
        for (int i = posicionCifra; i >= 0; i--) {
            cifra = (int) (numero / Math.pow(10, i))%10;
            System.out.println(cifra);
        }
    }
}