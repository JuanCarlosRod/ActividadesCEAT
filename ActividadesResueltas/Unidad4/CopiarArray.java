package Unidad4;

import java.util.Arrays;

public class CopiarArray {
    public static void main(String[] args) {
        int arrayUno[] = new int[5];

        for (int i = 0; i < arrayUno.length; i++) {
            arrayUno[i] = (int)(Math.random()*100+1);
        }

        mostrar(Arrays.toString(arrayUno));

        int arrayDos[] = new int[5];
        arrayDos = Arrays.copyOf(arrayUno, arrayUno.length);
        //copyOf construlle y devuelve una copia del origen al destino con la longitud indicada
        mostrar(Arrays.toString(arrayDos));
        //copyOfRange
        //crea y devuelve una tabla donde se copian los elementos indicados en el rango
        //indice desde, donde comienza
        //hasta... donde termina sin incluir este elemento

        int array3[] = Arrays.copyOfRange(arrayUno, 2,4);
        mostrar(Arrays.toString(array3));

        //Copiar con un metodo de la clase System
        int array4[] = new int[5];
        System.arraycopy(arrayUno,0,array4,0,arrayUno.length);

        mostrar(Arrays.toString(array4));
    }
    public static void mostrar(String texto){
        System.out.println(texto);
    }
}
