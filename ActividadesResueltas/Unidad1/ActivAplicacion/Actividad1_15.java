package Unidad1.ActivAplicacion;

import java.util.Scanner;

public class Actividad1_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,x;
        double y;

        System.out.print("Introduce el valor de A -> ");
        a = sc.nextInt();

        System.out.print("Introduce el valor de B -> ");
        b = sc.nextInt();

        System.out.print("Introduce el valor de C -> ");
        c = sc.nextInt();

        System.out.print("Introduce el valor de X -> ");
        x = sc.nextInt();

        y = (a*(Math.pow(x,2)))+(b*x)+c;

        System.out.println("El resultado del polinomio es: " + y);

    }
}
