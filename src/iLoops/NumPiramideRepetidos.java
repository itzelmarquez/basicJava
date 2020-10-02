package iLoops;

public class NumPiramideRepetidos {
    public static void main(String[] args) {
        int numeroRenglones = 4;
        int numRenglonActual = 1;

        while(numRenglonActual <= numeroRenglones) {
            //imprimir renglon por renglon.
            //while para imprimir del numero 1 al numero maximo del renglon
            int numeroMaximo = numRenglonActual;
            int contador = 1;
            while(contador <= numeroMaximo) {
                System.out.print(contador);
                contador++;

                //if()
            }
            System.out.println();
            numRenglonActual++;
        }
    }
}
