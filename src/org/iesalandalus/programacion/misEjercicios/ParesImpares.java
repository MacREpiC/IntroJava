import org.iesalandalus.programacion.utilidades.Entrada;

public class ParesImpares {

    public static void main(String[] args) {
        int numero;
        int cifra;
        numero = -1;
        int pares = 0;
        int impares = 0;

        while (numero <= 0) {
            System.out.print("Introduce un número mayor que cero: ");
            numero = Entrada.entero();
        }

        int posicionCifra = (int) Math.log10(numero);

        for (int i = posicionCifra; i >= 0; i--) {
            cifra = (int) (numero / Math.pow(10, i)) % 10;

            if (cifra % 2 == 0) {
                pares = pares + 1;
            } else {
                impares = impares + 1;
            }

            // Contar según el resto al dividir la cifra por 2
            for (int resto = 0; resto <= 9; resto++) {
                if (cifra % 2 == resto) {
                    pares++; // Suma 1 a 'pares' cuando el resto coincide
                }
            }
        }

        System.out.println("Cantidad de números pares del número " + numero + " es " + pares);
        System.out.println("Cantidad de números impares del número " + numero + " es " + impares);
    }
}
