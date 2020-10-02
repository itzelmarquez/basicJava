
//Escriba un programa que permita al usuario ingresar dos valores numericos, e imprima el resultado de sumar, rester, multiplicar
// y dividir esos dos valores

package Ejercicios;

import libs.Input;

public class ejercicio1 {
    public static void main(String[] args) {
    // Usuario ingresa el primer número
        System.out.println("Ingresa un 1er número: ");
        int primerNum = Input.get_int();

    // Usuario ingresa el segundo número
        System.out.println("Ingresa un 2do número: ");
        int segNum = Input.get_int();

    // Suma
        int suma;
        suma = primerNum + segNum;
        System.out.println("La suma de los numeros ingresados es: " + suma);

    // Multiplicación
        int mult;
        mult = primerNum * segNum;
        System.out.println("La multiplicación de los numeros ingresados es: " + mult);

    // Division
        int Div;
        Div = primerNum / segNum;
        System.out.println("La division de los numeros ingresados es: " + Div);

    // Resta
        int resta;
        resta = primerNum - segNum;
        System.out.println("La resta de los numeros ingresados es: " + resta);

    }
}
