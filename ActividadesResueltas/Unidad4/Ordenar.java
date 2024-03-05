package Unidad4;

import java.util.Arrays;

public class Ordenar {
    public static void main(String[] args) {
        //Ordenar un Array, se modifica el array...
        //Se ordena de forma creciente
        // Los datos pueden ser primitivos (numericos)
        int[] numeros = {5,7,8,0,1,12,2};
        //La funcion para ordenar es Arrays.sort(nombreArray);
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        //Ordenar tipos no primitivos (String)

        String nombres[]={"Maria", "Ana", "Xiomara", "Beatriz", "arancha"};
        Arrays.sort(nombres);
        System.out.println(Arrays.toString(nombres));


    }
}
