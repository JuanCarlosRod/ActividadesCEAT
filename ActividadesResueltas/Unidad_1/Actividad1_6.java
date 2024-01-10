package Unidad_1;

import java.util.Scanner;

public class Actividad1_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nota1;
        int nota2;

        System.out.print("Introduzca nota 1 -> ");
        nota1 = sc.nextInt();

        System.out.print("Introduzca nota 2 -> ");
        nota2 = sc.nextInt();

        int resultado = (nota1 + nota2)/2;

        System.out.println("Media de las notas: " + resultado);
    }
}
