package Unidad4;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysAlumnos {
    public static void main(String[] args) {
        mostrarAlumnos(alumnosDatos());
    }

    /* FUNCION LEEMOS LOS DATOS DE LOS ALUMNOS Y LO GUARDAMOS EN EL ARRAY*/
    public static String[][] alumnosDatos(){
        Scanner sc = new Scanner(System.in);

        String alumnos[][] = new String[13][4];
        for (int i = 0; i < 13; i++) {

            for (int j = 0; j < 4; j++) {
                //Si es la columna 0 -> Nombre
                if (j == 0 ){
                    mostrarSinLn("Inserta el nombre del alumno: ");
                    alumnos[i][j] = sc.next();sc.nextLine();
                }
                //Si es la columna 1 -> Apellido
                if (j == 1){
                    mostrarSinLn("Inserta el apellido del alumno: ");
                    alumnos[i][j] = sc.next();sc.nextLine();
                }
                //Si es la columna 2 -> Profesion
                if (j == 2){
                    mostrarSinLn("Inserta la profesion del alumno: ");
                    alumnos[i][j] = sc.next();sc.nextLine();
                }
                //Si es la columna 3 -> Email
                if(j == 3){
                    mostrarSinLn("Inserta el email del alumno: ");
                    alumnos[i][j] = sc.next();sc.nextLine();
                }
            }
        }

        return alumnos;
    }

    /*
    * FUNCION QUE MUESTRA LA INFORMACION ORDENADA POR EL NOMBRE DE LOS ALUMNOS Y EN FORMA DE TABLA (foreach)
    * */

    public static void mostrarAlumnos(String alumnos[][]){
        for (String fila[]: alumnos ){
            for (String column: fila){

                mostrarSinLn(column + " ");
            }
            mostrar("");
        }


    }

    public static void mostrar(String texto){
         System.out.println(texto);
    }

    public static void mostrarSinLn(String texto){
         System.out.print("\t" + texto);
    }
}
