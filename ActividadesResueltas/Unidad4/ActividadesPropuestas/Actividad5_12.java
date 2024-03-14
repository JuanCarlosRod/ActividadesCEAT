package Unidad4.ActividadesPropuestas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_12 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int tabla[] = crearTabla();
        mostrar(Arrays.toString(tabla));
        mostrar("El nuevo orden sera -> " + Arrays.toString(ordenAleatorio(tabla)));
    }
    
    public static int[] crearTabla(){
        mostrar("Indique el numero de elementos a insertar");
        int longitud = sc.nextInt();
        int tabla[] = new int[longitud];

        for (int i = 0; i < tabla.length; i++) {
            mostrarSinLn("Indique el elemnto " + (i+1)+ "-> ");
            tabla[i] = sc.nextInt();
        }
        Arrays.sort(tabla);

        return tabla;
    }

    //Metodo para desordenar la tabla generada
    public static int[] ordenAleatorio(int tabla[]){
        //Mediante un bucle de recorrido por toda la tabla
        //valor1 / valor2 = Random con 2 valores multiplicado por la longitud de la tabla
        //variable auxiliar = valor1
        //valor1 = valor2
        //valor2 = aux;
        for (int i = 0; i < tabla.length; i++) {
            int valor1 = (int) (Math.random()*tabla.length);
            int valor2 = (int) (Math.random()*tabla.length);
            int aux = tabla[valor1];
            tabla[valor1] = tabla[valor2];
            tabla[valor2] = aux;
        }
        return tabla;
    }
    public static void mostrar(String texto){
         System.out.println(texto);
    }
    
    public static void mostrarSinLn(String texto){
         System.out.print(texto);
    }
}
