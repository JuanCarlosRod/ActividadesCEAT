package Unidad4.EjerciciosResueltos;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_7 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int tabla[] = crearArray();
        mostrar("Tabla inicial -> " + Arrays.toString(tabla));
        sinRepetidos(tabla);

    }

    public static int[] crearArray(){
        mostrar("Indique la longitud de la tabla -> ");
        int longitud = sc.nextInt();

        int tabla[]= new int[longitud];
        for (int i = 0; i < longitud; i++) {
            tabla[i] = (int) (Math.random()*20+1);
        }
        return tabla;
    }

    public static void sinRepetidos(int tabla[]){
        int duplicados[] = new int[0];
        for (int i = 0; i < tabla.length; i++) {
            if(!buscar(duplicados, tabla[i])){
                duplicados = Arrays.copyOf(duplicados,duplicados.length+1);
                duplicados[duplicados.length-1]=tabla[i];
            }
        }
        mostrar("Tabla duplicados ->" + Arrays.toString(duplicados));
    }

    public static boolean buscar(int tabla[], int numero){
        boolean existe = false; //Creamos un booleano que controle si existe el producto
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == numero){
                existe = true;
            }
        }
          return existe;
    }

    public static void mostrar(String texto){
         System.out.println(texto);
    }

    public static void mostrarSinLn(String texto){
         System.out.print(texto);
    }
}
