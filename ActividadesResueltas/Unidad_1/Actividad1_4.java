package Unidad_1;

import java.util.Scanner;

public class Actividad1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int actualYear, userYear;

        System.out.print("Introduce el año actual -> ");

        actualYear = sc.nextInt();

        System.out.print("Introduce el año de tu nacimiento -> ");

        userYear = sc.nextInt();

        int yearCalcu = actualYear-userYear;

        System.out.println("La edad del usuario es: " + yearCalcu);
    }
}
