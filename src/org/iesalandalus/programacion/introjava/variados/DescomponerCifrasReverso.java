package org.iesalandalus.programacion.introjava.variados;
import org.iesalandalus.programacion.utilidades.Entrada;

public class DescomponerCifrasReverso {

    public static void main(String[] args) {
        int numero;
        int cifra;
        numero = -1;
        while (numero <= 0) {
            System.out.print("Introduce un número mayor que cero: ");
            numero = Entrada.entero();
        }
        int posicionCifra = (int) Math.log10(numero);
        for (int i = 0; i <= posicionCifra; i++) {
            cifra = (int) (numero / Math.pow(10, i))%10;
            System.out.println(cifra);
        }
    }
}