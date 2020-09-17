package iLoops;

import libs.Input;

public class Piramide {
    public static void main(String[] args) {
        int altura;
        int renglon = 1;

        System.out.println("Ingresa num. de escalones: ");
        altura = Input.get_int();
        while (altura < 0){
            System.out.println("Ingresa un número de escalones positivo");
            altura = Input.get_int();

        }
        while(renglon <= altura) {
            int numGatos = renglon + 1;
            imprimirEspacios(altura, numGatos);
            imprimirGatos(numGatos);
            Input.print(" ");
            imprimirGatos(numGatos);
            System.out.println();
            renglon++;
        }
    }

    private static void imprimirEspacios(int altura, int numGatos) {
        int numEspacios = altura + 1 - numGatos;
        int numEspaciosActual = 0;
        while(numEspaciosActual < numEspacios) {
            Input.print(" ");
            numEspaciosActual++;
        }

    }

    private static void imprimirGatos(int numGatos) {
        int numeroActualGatos = 0;
        while(numeroActualGatos < numGatos) {
            Input.print("#");
            numeroActualGatos++;
        }
    }
}

