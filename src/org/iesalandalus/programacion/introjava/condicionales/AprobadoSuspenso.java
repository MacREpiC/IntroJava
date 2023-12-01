package org.iesalandalus.programacion.introjava.condicionales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class AprobadoSuspenso {
    public static void main(String[] args) {
        float nota;
        System.out.print("Dime una nota: ");
        nota = Entrada.real();
        if (nota >= 5){
            System.out.println("Estás aprobado");
        } else {
            System.out.println("Estás suspenso");
        }
    }
}