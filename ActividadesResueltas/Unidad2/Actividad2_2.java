package Unidad2;

import java.util.Scanner;

public class Actividad2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Introduce un número -> ");
        num1 = sc.nextInt();

        System.out.print("Introduce un segundo número -> ");
        num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Los números son iguales");
        } else {
            System.out.println("Los números no son iguales");
        }
    }
}
