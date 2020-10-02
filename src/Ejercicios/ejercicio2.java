//Cree un programa que genere un numero secreto entre 0 y 10, y que pida al usuario adivinar
// el numero.  Solo de un intento.

package Ejercicios;

import libs.Input;

import java.util.Random;

public class ejercicio2 {
    public static void main(String[] args) {

        //Usuario ingresa un numero
        System.out.println("Adivina el numero secreto entre  0-10: ");
        int numUsuario = Input.get_int();

        //Comparación
        int numSec = new Random().nextInt(11);

    //Acerto al numero
        if(numUsuario ==numSec) {
        System.out.println("Felicidades acertaste el numero secreto es: " + numSec);
        // El numero es diferente
    } else if(numUsuario< 0||numUsuario >10)

    {
        System.out.println("Error. El numero debe estar entre 0 y 10." + numSec);
    } else

    {
        System.out.println("¡Mala suerte!  el numero correcto es " + numSec);
        //El numero es negativo
    }
}
}
