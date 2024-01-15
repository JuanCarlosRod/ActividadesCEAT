package ActividadesPropuestas;

import java.util.Scanner;

public class Enunciado3 {

    //Teniendo como base, que el 100% de un colegio esta formado por todos los alumnos,
    // solicita cuantas niñas y cuantos niños hay, e indica el porcentaje de cada uno.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNiños, numNiñas, alumnTotal;
        double porcentajeNiños, porcentajeNiñas;

        System.out.print("Introduce el numero de niños que hay -> ");
        numNiños = sc.nextInt();

        System.out.print("Introduce el número de niñas que hay -> ");
        numNiñas = sc.nextInt();

        alumnTotal = numNiños + numNiñas;

        porcentajeNiños = (numNiños*100)/alumnTotal;
        porcentajeNiñas = 100 - porcentajeNiños;
        //porcentajeNiñas = (numNiños*100)/alumnTotal;

        System.out.println("El porcentaje de niños es del " + porcentajeNiños+ "%");
        System.out.println("El porcentaje de niñas es del " + porcentajeNiñas + "%");
    }
}
