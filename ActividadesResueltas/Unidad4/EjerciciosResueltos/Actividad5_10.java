package Unidad4.EjerciciosResueltos;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int tablaImportada[] = arrayOriginal();

        int resultado[] = eliminarMayores(tablaImportada);

        mostrar("Resultado final -> " + Arrays.toString(resultado));
    }

    public static int[] arrayOriginal(){
        mostrar("Indique la longitud de la tabla Array: ");
        int longitud = sc.nextInt();

        int tabla[] = new int[longitud];
        for (int i = 0; i < tabla.length; i++) {
            mostrar("Introduce un numero a la tabla: ");
            tabla[i] = sc.nextInt();
        }

        return tabla;
    }

    public static int[] eliminarMayores(int tabla[]){
        Arrays.sort(tabla);
        mostrar("Tabla inicial-> " + Arrays.toString(tabla));
        mostrarSinLn("A partir de que valor quiere eliminar ->");
        int valor = sc.nextInt();

        int copia[] = Arrays.copyOf(tabla, tabla.length);
        int i = 0;

        while(i<copia.length){

            if (copia[i] > valor){
                copia[i] = copia[copia.length-1];
                copia = Arrays.copyOf(copia, copia.length-1);

            }else {
                i++;
            }
        }
        return copia;
    }

    public static void mostrar(String texto){
         System.out.println(texto);
    }

    public static void mostrarSinLn(String texto){
         System.out.print(texto);
    }
}
