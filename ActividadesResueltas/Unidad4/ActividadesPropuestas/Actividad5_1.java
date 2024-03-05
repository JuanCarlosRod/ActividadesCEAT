package Unidad4.ActividadesPropuestas;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Crea 5 elementos:
 *Enteros, doubles y booleanos
 * Mostrarlos -> Usa una función
 *
 */
public class Actividad5_1 {
    static Scanner sc = new Scanner(System.in);
    static int edades[] = new int[5];
    static double precios[] = new double[5];
    static boolean verdades[] = new boolean[5];


    public static void main(String[] args) {
        edadesProc();
    }

    public static void edadesProc(){
        for (int i = 0; i < edades.length; i++) {
         mostrar("Introduce edad: ");
         edades[i] = sc.nextInt();
        }
        mostrar("Las edades introducidas son: " + Arrays.toString(edades));

        precioProd();
    }
    public static void precioProd(){
        for (int i = 0; i < precios.length; i++) {
            mostrar("Introduce los precios: ");
            precios[i] = sc.nextDouble();
        }
        mostrar("Los precios introducidos son: " + Arrays.toString(precios));

        verdadesProc();
    }
    public static void verdadesProc(){
        for (int i = 0; i < verdades.length; i++) {
            mostrar("Introduce verdad o falso: ");
            verdades[i] = sc.nextBoolean();
        }
        mostrar("Las verdades introducidas son: " + Arrays.toString(verdades));
    }

    public static void mostrar(String texto){
        System.out.println(texto);
    }
}
