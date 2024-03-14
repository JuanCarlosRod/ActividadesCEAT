package Unidad4.EjerciciosResueltos;


import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_9 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        notasProgr();

    }

    public static void notasProgr(){
        int notasProg[] = new int[5];

        for (int i = 0; i < notasProg.length; i++) {
            mostrarSinLn("Nota del programador-> ");
            notasProg[i] = sc.nextInt();
        }

        Arrays.sort(notasProg);

        mostrar(Arrays.toString(notasProg));

        agregarNuevos(notasProg);
    }

    public static void agregarNuevos(int[] notas){
        mostrar("Introduce nota de exhibicion -> ");
        int nuevaNota = sc.nextInt();

        while(nuevaNota != -1){
            int indiceInsercion = Arrays.binarySearch(notas, nuevaNota);

            if (indiceInsercion < 0) {
                indiceInsercion = -indiceInsercion - 1;
            }

            int[] copiaNotas = new int[notas.length + 1];
            System.arraycopy(notas,0,copiaNotas,0,indiceInsercion);

            mostrar("CORTADO HASTA SU POSICION - >" + Arrays.toString(copiaNotas));
            copiaNotas[indiceInsercion] = nuevaNota;

            mostrar("INSERTADO -> "+ Arrays.toString(copiaNotas));

            System.arraycopy(notas,indiceInsercion,copiaNotas,indiceInsercion+1,notas.length-indiceInsercion);

            notas = copiaNotas;

            mostrar("Notas agregadas finales: " + Arrays.toString(notas));

            mostrar("Introduce nota de exhibicion -> ");
            nuevaNota = sc.nextInt();
        }
    }

    public static void mostrar(String texto){
         System.out.println(texto);
    }

    public static void mostrarSinLn(String texto){
         System.out.print(texto);
    }
}
