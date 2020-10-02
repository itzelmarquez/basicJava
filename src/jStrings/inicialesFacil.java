package jStrings;

import libs.Input;

import static java.lang.System.out;

public class inicialesFacil {
    public static void main(String[] args) {
        System.out.print("Escribe tu nombre completo: ");
        String nombre = Input.get_string();
        System.out.print(nombre.charAt(0));
        int nombreTotalCarateres = nombre.length();
        int posicionActual = 1;
        while(posicionActual <= nombreTotalCarateres -1){
            char caracterActual = nombre.charAt(posicionActual);
            if(caracterActual == ' '){
                System.out.print(nombre.charAt(posicionActual+1));


            }
            posicionActual++;
        }
    }
}
