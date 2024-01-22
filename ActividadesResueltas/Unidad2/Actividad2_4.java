package Unidad2;

import java.util.Scanner;

public class Actividad2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;

        System.out.print("Introduce un número decimal -> ");
        num = sc.nextDouble();

        if(num < 1 && num != 0 && num > -1 ) {
            System.out.println("El numero introducido es cercano a 0");
        } else {
            System.out.println("El número no es cercano a 0");
        }
    }
}
