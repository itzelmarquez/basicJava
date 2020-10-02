package jStrings;

import libs.Input;

public class InicialesDificil {
    char letraM= ' ';
    char c =' ';
    String str = "";

    public static void main(String[] args) {
        // Usuario escribe el nombre completo
        System.out.print("Escribe tu nombre completo: ");

        // Var string nombre = al lo que se coloca en la pantalla
        String nombre = Input.get_string();

        // Imprime la posicion 1
        System.out.print(nombre.charAt(0));

        //Declaracion de variables
        int nombreTotalCarateres = nombre.length();
        int posicionActual = 1;

        // ciclo para escribir las primeras letras
        // si la posicion actual es menor o igual al total de caracteres -1
        while (posicionActual <= nombreTotalCarateres - 1) {

            //Declaracion de variable de posicion actual
            char caracterActual = nombre.charAt(posicionActual);
            //Si exixte un espacio salta a la siguiente posicion y escribe
            if (caracterActual == ' ') {
                System.out.print(nombre.toUpperCase());
            }
            posicionActual++;
        }
    }
}


