package Unidad2;

import java.util.Scanner;

public class Actividad2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Introduce el primer número -> ");
        a = sc.nextInt();

        System.out.print("Introduce el segundo número -> ");
        b = sc.nextInt();

        if ( a == b) {
            System.out.println("Los números introducidos son iguales");
        } else {
            if(a > b) {
                System.out.println(a+ " es mayor que " + b);
            } else {
                System.out.println(a + " es menor que " + b);
            }
        }

    }
}
