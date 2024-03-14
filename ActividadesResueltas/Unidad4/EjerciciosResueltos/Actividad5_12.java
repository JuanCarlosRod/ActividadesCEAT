package Unidad4.EjerciciosResueltos;

import java.util.Arrays;

public class Actividad5_12 {
    public static void main(String[] args) {
        int num[][] = operacion();
        mostrarOrdenada(num);
    }

    public static int[][] operacion(){
        int num[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = 10*i+j;
            }
        }

        return num;
    }

    public static void mostrarOrdenada(int num[][]){
        for (int fila[]: num ){
            for (int column: fila){
                mostrarSinLn(column + " ");
            }
            mostrar("");
        }
    }

    public static void mostrar(String texto){
         System.out.println(texto);
    }

    public static void mostrarSinLn(String texto){
         System.out.print("\t"+texto);
    }
}
