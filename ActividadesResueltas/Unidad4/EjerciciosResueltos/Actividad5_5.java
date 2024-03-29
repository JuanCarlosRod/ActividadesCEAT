package Unidad4.EjerciciosResueltos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_5 {

    //Rellenar una tabla con numeros aleatorios en el rango de 2 hasta fin, retornando la tabla ordenada
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mostrar("Indica la longitud de la tabla -> ");
        int longitud = sc.nextInt();
        mostrar("Indica el numero fin de los numeros aleatorios");
        int fin = sc.nextInt();

        int pares[] = new int[longitud];
        for (int i = 0; i < pares.length; i++) {
            int num = (int) (Math.random()*fin+1);
            if (num%2 == 0){
                pares[i] = num;
            }else {
                --i;
            }
        }
        Arrays.sort(pares);
        mostrar(Arrays.toString(pares));
    }

    public static void mostrar(String texto){
        System.out.println(texto);
    }
}
