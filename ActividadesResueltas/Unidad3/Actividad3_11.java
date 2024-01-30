package Unidad3;

import java.util.Scanner;

public class Actividad3_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double factorial = 1;
        int num;

        System.out.println("Introduzca un número -> ");
        num = sc.nextInt();

        for (int i = num; i > 0; i--){
            factorial *=i;
        }

        System.out.println("Factorial " + num + " es " + factorial);


    }
}
