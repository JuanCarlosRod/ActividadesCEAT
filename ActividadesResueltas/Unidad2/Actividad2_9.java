package Unidad2;

import java.util.Scanner;

public class Actividad2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduce un nómero del 0 al 99.999 -> ");
        num = sc.nextInt();

        if (num < 10){
            System.out.println("Tiene 1 cifra");

        } else if (num < 100){
            System.out.println("Tiene 2 cifra");

        } else if (num < 1000) {
            System.out.println("Tiene 3 cifra");

        } else if (num < 10000) {
            System.out.println("Tiene 4 cifra");

        } else if (num < 100000) {
            System.out.println("Tiene 5 cifra");
        }

    }
}
