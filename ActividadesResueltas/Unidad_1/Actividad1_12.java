package Unidad_1;

import java.util.Scanner;

public class Actividad1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, valorAbs;

        System.out.print("Introduce un número positivo o negativo -> ");
        num = sc.nextInt();

        valorAbs = Math.abs(num);

        System.out.println("El valor absoluto de "+ num + " es: " +valorAbs);
    }
}