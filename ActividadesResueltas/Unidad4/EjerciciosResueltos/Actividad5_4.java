package Unidad4.EjerciciosResueltos;

import java.util.Scanner;

public class Actividad5_4 {
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

        mostrar("El valor maximo insertado es -> " + maximo(numeros));
    }

    public static void mostrar(String texto){
        System.out.println(texto);
    }

    public static void mostrarSinLn(String texto){
        System.out.print(texto);
    }

    public static int maximo(int t[]){
        int max = t[0]; // asumimos que al menos hay 1 elemento
        for (int elemento:t) {//recorremos el array pasado por parametros
            if (elemento > max){  //validamos cada elemento y comparamos con el max acumulado
                max = elemento;
            }
        }

        return max;
    }
}
