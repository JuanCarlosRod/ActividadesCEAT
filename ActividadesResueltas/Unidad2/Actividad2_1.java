package Unidad2;

import java.util.Scanner;

public class Actividad2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduce un número para comprobar si es par -> ");
        num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("El número es Par");
        }else {
            System.out.println("El número es Impar");
        }
    }
}
