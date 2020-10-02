package gNumericTypes;

import libs.Input;

public class BotellasAgua {
    static int numMinutos;
    static int numBotellas;

    public static void main(String[] args) {
        System.out.println("Cuantos minutos estas en la ducha:");
        numMinutos = Input.get_int();
        //si el numero es positivo, muestra un mensaje correcto, multiplica por doce y imprime el numBotellas
        if(numMinutos >= 0) {
            numBotellas = numMinutos * 12;
            System.out.println("Numero de botellas " + numBotellas);

        } else {
            System.out.println("El numero ingresado no es valido.");
        }
        //else imprime un mensaje de error

    }
}