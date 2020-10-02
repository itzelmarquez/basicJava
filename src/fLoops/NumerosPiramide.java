//Escriba un programa que imprima lo siguiente
//1
//12
//123
package fLoops;

public class PiramideNumeros {

    public static void main(String[] args) {
        int numeroRenglones = 10;
        int numRenglonActual = 1;
        while(numRenglonActual <= numeroRenglones) {
            //imprimir renglon por renglon.
            //while para imprimir del numero 1 al numero maximo del renglon
            int numeroMaximo = numRenglonActual;
            int contador = 1;
            while(contador <= numeroMaximo) {
                System.out.print(contador);
                contador++;
            }
            System.out.println();
            numRenglonActual++;
        }
    }
}