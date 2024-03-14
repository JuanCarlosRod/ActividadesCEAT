package Unidad4.ActividadesPropuestas;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_11 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int tabla[] = crearTabla();
        int resultado[] = buscarIndice(crearTabla());
        mostrar("EL resultado encontrado es: ");
        mostrar(Arrays.toString(resultado));
    }
    
    public static int[] crearTabla(){
        mostrar("Indique el numero de elementos a insertar");
        int longitud = sc.nextInt();
        int tabla[] = new int[longitud];

        for (int i = 0; i < tabla.length; i++) {
            mostrarSinLn("Indique el elemnto " + (i+1)+ "-> ");
            tabla[i] = sc.nextInt();
        }

        return tabla;
    }

    public static int[] buscarIndice(int tabla[]){
        int aux[] = new int[0];
        mostrarSinLn("Indique el numero buscado -> ");
        int buscar = sc.nextInt();

        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == buscar){
                aux = Arrays.copyOf( aux, aux.length+1);
                aux[aux.length-1] = tabla[i];
            }
        }
        return aux;
    }
    public static void mostrar(String texto){
         System.out.println(texto);
    }
    
    public static void mostrarSinLn(String texto){
         System.out.print(texto);
    }
}
