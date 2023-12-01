package org.iesalandalus.programacion.introjava.variados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Menu {
    public static void main(String[] args) {
        int opcion;
        opcion = -1;
        System.out.println("1.- Abrir.");
        System.out.println("2.- Cerrar.");
        System.out.println("3.- Mostrar.");
        System.out.println("0.- Salir.");

        while (opcion < 0 || opcion > 3) {
            System.out.print("Introduce un número mayor que cero: ");
            opcion = Entrada.entero();
        }
        switch (opcion) {
            case 0:
                System.out.println("Hasta luego Lucas!!!");
                break;
            case 1:
                System.out.println("Ha elegido la opción abrir.");
                break;
            case 2:
                System.out.println("Ha elegido la opción cerrar.");
                break;
            case 3:
                System.out.println("Ha elegido la opción mostrar.");
                break;
        }
    }
}
