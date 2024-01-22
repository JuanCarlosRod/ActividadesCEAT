package Unidad2.ActiviPropuestas;

import java.util.Scanner;

public class Actividad2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Introduce el primer número -> ");
        a = sc.nextInt();

        System.out.print("Introduce el segundo número -> ");
        b = sc.nextInt();

        if(a != b || a == 0 || b == 0){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
