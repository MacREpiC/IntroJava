package org.iesalandalus.programacion.introjava.condicionales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class OrdenarDosNumero {
    public static void main(String[] args) {
        float num1, num2;
        System.out.print("Dime el primer número: ");
        num1 = Entrada.real();
        System.out.print("Dime el segundo número: ");
        num2 = Entrada.real();

        if(num1<num2){
            System.out.println(num2 + " , " + num1);
        } else {
            System.out.println(num1 + " , " + num2);
        }
    }
}
