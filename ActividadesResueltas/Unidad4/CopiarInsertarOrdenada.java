package Unidad4;

import java.util.Arrays;

public class CopiarInsertarOrdenada {
    public static void main(String[] args) {
     int t[] = {1,2,3,4,6,7,8}; //tabla original donde se insertara uno nuevo
     int nuevo = 5;
     int indiceInsercion = Arrays.binarySearch(t, nuevo);
     //Si el indice de insercion es negativo, debemos pasarlo a positivo y restar -1
     if (indiceInsercion < 0){
         indiceInsercion =-indiceInsercion-1; //Nos da como resultado, donde deberia estar el nuevo elemento
     }
     //Comenzamos con el proceso de copia del array para ingresar el nuevo elemento
     int[] copia = new int[t.length + 1];
     System.arraycopy(t,0,copia,0,indiceInsercion);
     mostrar("Array copiado hasta el punto de insercion ->" +Arrays.toString(copia));
     copia[indiceInsercion] = nuevo;
        mostrar("Array copiado con elemento insertado -> "+ Arrays.toString(copia));
        System.arraycopy(t,indiceInsercion,copia,indiceInsercion+1,t.length-indiceInsercion);
        mostrar("Array copiado completo -> " + Arrays.toString(copia));
        t = copia;
        mostrar("Array final igualado a copia para sustitirlo por el nuevo -> " + Arrays.toString(t));
    }

    public static void mostrar(String texto){
         System.out.println(texto);
    }

    public static void mostrarSinLn(String texto){
         System.out.print(texto);
    }
}
