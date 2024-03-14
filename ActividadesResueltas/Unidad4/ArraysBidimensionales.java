package Unidad4;


import java.util.Arrays;
import java.util.Scanner;

public class ArraysBidimensionales {
    public static void main(String[] args) {
        mostrar("Tabla: " + Arrays.deepToString(solicitarNumero()));//solicito qye te muestre el resultado de la funcion
    }

    public static int[][] solicitarNumero(){
        Scanner sc = new Scanner(System.in);
        int numeros[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mostrar("Ingrese el numero de la fila " + i + " y la columna " + j + " ->");
                numeros[i][j] = sc.nextInt();
            }
        }

        return numeros;
    }

    public static void mostrar(String texto){
         System.out.println(texto);
    }

    public static void mostrarSinLn(String texto){
         System.out.print(texto);
    }
}
