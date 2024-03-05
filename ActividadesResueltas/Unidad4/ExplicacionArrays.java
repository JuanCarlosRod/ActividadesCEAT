package Unidad4;

import java.util.Arrays;
import java.util.Scanner;

public class ExplicacionArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //La decalaracion de un array o tabla debe contener 3 elementos
        //El tipo de dato
        //El nombre de la variable
        //La longitud

        mostrar("¿Cuantas edades vas a insertar?");
        int numEdades = sc.nextInt();

        int edad[] = new int[numEdades];
        for (int i = 0; i < numEdades; i++) {
            mostrar("Inserte la edad Nº "+ (i+1) + ": ");
            int newEdad = sc.nextInt();

            edad[i] = newEdad;
        }

        mostrar("");
        mostrar("Edades introducidas: " + Arrays.toString(edad));


        //bucle foreach : Bucle para recorrer tablas

        for (int eda:edad){
            mostrar("Edad:" + eda);
        }

        //Metodos de la API de JAVA sobre los arrays
        //Conocer la longitud de una array
        mostrar("Longitud del array Edad-> " + edad.length);
        mostrar("");

        for (int i = 0; i < edad.length; i++) {
            mostrar("La edad insertada en la posicion " + (i+1) + " es : " + edad[i]);
        }

        //Referencias en los arrays, variables, etc.
        mostrar("************************REFERENCIAS DE MEMORIA*****************************");
        System.out.println(edad);
    }

    public static void mostrar(String texto){
        System.out.println(texto);

//        int edad[] = new int[5];
//        edad[0] = 15;
//        edad[1] = 36;
//        edad[2] = 87;
//        edad[3] = 25;
//        edad[4] = 53;
//
//        System.out.println(Arrays.toString(edad));
//
//        String alumnos[] = new String[5];
//        alumnos[0] = "Juan Carlos";
//        alumnos[1] = "Tania";
//        alumnos[2] = "Marina";
//        alumnos[3] = "Fran";
//        alumnos[4] = "Enrique";
//
//        System.out.println(Arrays.toString(alumnos));



    }
}
