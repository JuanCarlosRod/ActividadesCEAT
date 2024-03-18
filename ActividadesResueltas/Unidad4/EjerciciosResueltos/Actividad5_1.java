package Unidad4.EjerciciosResueltos;

import java.util.Arrays;
import java.util.Scanner;

/*
* Crear una tabla de longitud 10 que se inicializará con números aleatorios entre el 1 y el 100.
* Mostrar la suma de todos los números que se guarden en la tabla
* */
public class Actividad5_1 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100 + 1);
            suma += numeros[i];
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("La suma de los numeros es: " + suma);

//        Salida con foreach

        for (int elem : numeros) {
            System.out.print(elem + "+");
        }
        System.out.print("=" + suma);
        System.out.println("");
        String[] id = new String[5];
        //inicializar con un valor predeterminado un array
        Arrays.fill(id, "nombre");
        System.out.println(Arrays.toString(id));
    }
//        double edad[] = new double[10];
//        edad[0] = 15;
//        edad[1] = 36;
//        edad[2] = 87;
//        edad[3] = 25;
//        edad[4] = 25;
//        edad[5] = 25;
//        edad[6] = 25;
//        edad[7] = 25;
//        edad[8] = 25;
//        edad[9] = 53;
//
//        double[] puntuacion = new double[10];
//        for (int i = 0; i < edad.length; i++) {
//            Arrays.fill(puntuacion, edad[i]);
//        }
//
//        System.out.println("Puntuaciones: "+Arrays.toString(puntuacion));
//    }
}
