package Unidad4.EjerciciosResueltos;

import java.util.Scanner;

public class Actividad5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mostrar("Indique el numero de elementos enteros a insertar -> ");
        int longitud = sc.nextInt();

        int numeros[] = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            mostrar("Indique el número ->");
            numeros[i] = sc.nextInt();
        }



        mostrar("Muestra de forma inversa los numeros insertados");
        mostrar("···············································");

        for (int i = numeros.length-1; i <= 0 ; i--) {
            mostrar("->" + numeros[i]);
        }
    }

    public static void mostrar(String texto){
        System.out.println(texto);
    }
}
