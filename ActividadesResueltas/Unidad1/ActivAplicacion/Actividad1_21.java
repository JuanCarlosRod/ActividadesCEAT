package Unidad1.ActivAplicacion;

import java.util.Scanner;

public class Actividad1_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Introduce un número A -> " );
        a = sc.nextInt();

        System.out.print("Introduce un número B -> ");
        b = sc.nextInt();

        boolean c = a == b ? true : false;

        System.out.println("¿Los números son iguales? " + c);

        if (a==b)
            System.out.println("A y B son iguales");
        else
            System.out.println("A y B no son iguales");
    }
}
