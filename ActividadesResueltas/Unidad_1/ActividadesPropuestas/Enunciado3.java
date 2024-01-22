package Unidad_1.ActividadesPropuestas;

import java.util.Scanner;

public class Enunciado3 {

    //Teniendo como base, que el 100% de un colegio esta formado por todos los alumnos,
    // solicita cuantas niñas y cuantos niños hay, e indica el porcentaje de cada uno.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNinos, numNinas, alumnTotal;
        double porcentajeNinos, porcentajeNinas;

        System.out.print("Introduce el numero de niños que hay -> ");
        numNinos = sc.nextInt();

        System.out.print("Introduce el número de niñas que hay -> ");
        numNinas = sc.nextInt();

        alumnTotal = numNinos + numNinas;

        porcentajeNinos = (double) (numNinos*100)/alumnTotal;
        porcentajeNinas = 100 - porcentajeNinos;
        //porcentajeNiñas = (numNiños*100)/alumnTotal;

        System.out.println("El porcentaje de niños es del " + porcentajeNinos+ "%");
        System.out.println("El porcentaje de niñas es del " + porcentajeNinas + "%");
    }
}
