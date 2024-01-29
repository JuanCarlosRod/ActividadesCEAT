package Unidad3;

import java.util.Scanner;

public class Actividad3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num;

        System.out.print("Introduce un número -> ");
        num = sc.nextByte();

        while ( num != 0 ){
            if ( num % 2 != 0) {
                System.out.println(num + " es impar");
            } else {
                System.out.println(num + " es par");
            }
            System.out.print("Introduce un número -> ");
            num = sc.nextByte();
        }

        System.out.println("Finalizado");
    }
}
