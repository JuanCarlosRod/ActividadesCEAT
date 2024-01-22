package Unidad2;

import java.util.Scanner;

public class Actividad2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Introduce el primer número -> ");
        a = sc.nextInt();

        System.out.print("Introduce el segundo número -> ");
        b = sc.nextInt();

        int mayor = a > b ? a : b;
        int menor = a < b ? a : b;

        System.out.println( mayor + ", " + menor);
    }
}
