package Unidad2;

import java.util.Scanner;

public class Actividad2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, x, x1, x2, d;

        System.out.print("Introuce el valor de a -> ");
        a = sc.nextDouble();

        System.out.print("Introuce el valor de b -> ");
        b = sc.nextDouble();

        System.out.print("Introuce el valor de c -> ");
        c = sc.nextDouble();

        d = Math.pow(b, 2) - 4*a*c;

        if (d < 0 ){
            System.out.println("No existen soluciones reales");
        } else {
            if (a == 0) {
                System.out.println("No es una ecuacion de 2º Grado");
            } else {
                x1 = (-b - (Math.sqrt(d)))/2*a;
                x2 = (-b + (Math.sqrt(d)))/2*a;
                System.out.println("Solucion del resultado x1 = " +x1);
                System.out.println("Solucion del resultado x2 = " +x2);
            }
        }



    }
}
