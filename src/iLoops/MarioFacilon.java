package iLoops;

import libs.Input;

public class MarioFacilon {

    public static void main(String[] args) {
        int altura = 10;
        int renglon = 1;
        while(renglon <= altura) {
            int numGatos = renglon + 1;
            imprimirEspacios(altura, numGatos);
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