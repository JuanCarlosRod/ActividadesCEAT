package Unidad3;

import java.util.Scanner;

public class Actividad3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edadAlum = 0, sumaEdad = 0, media, mayorEdad = 0, numAlum = 0;

        System.out.print("Introduzca la edad del alumno -> ");
        edadAlum = sc.nextInt();

        while (edadAlum > 0){
            sumaEdad += edadAlum;
            numAlum ++;
            if (edadAlum >= 18){
                mayorEdad++;
            }

            System.out.print("Introduzca la edad del alumno -> ");
            edadAlum = sc.nextInt();

        }
        media = sumaEdad / numAlum;

        System.out.println("Numero total de alumnos: " + numAlum);
        System.out.println("Suma de todas las edades: " + sumaEdad);
        System.out.println("Media de edad de los alumnos: " + media);
        System.out.println("Alumnos mayores de edad: " + mayorEdad);

    }
}
