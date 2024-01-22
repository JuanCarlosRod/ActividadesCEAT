package Unidad2.ActiviPropuestas;

import java.util.Scanner;

public class Actividad2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduce un número, (positivo o negativo) ->");
        num = sc.nextInt();

        if(num >= 0){
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }

    }
}
