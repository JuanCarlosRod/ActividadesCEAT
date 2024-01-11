package Unidad_1;

import java.util.Scanner;

public class Actividad1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota1, nota2, nota3, mediaBoletin;
        double notaFinal;

        System.out.print("Introduzca su nota del primer trimestre: ");
        nota1 = sc.nextInt();

        System.out.print("Introduzca su nota del segundo trimestre: ");
        nota2 = sc.nextInt();

        System.out.print("Introduzca su nota del tercer trimestre: ");
        nota3 = sc.nextInt();

        notaFinal = (nota1+ nota2 +nota3) / 3.0;

        mediaBoletin = (int) notaFinal;

        System.out.println("Su nota media del curso es: " + mediaBoletin);

    }
}
