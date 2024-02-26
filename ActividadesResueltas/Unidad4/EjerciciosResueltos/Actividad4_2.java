package Unidad4.EjerciciosResueltos;

import java.util.Scanner;

public class Actividad4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Introduce el primer número: ");
        num1 = sc.nextInt();

        System.out.println("Introduce el segundo número: ");
        num2 = sc.nextInt();

        numInter(num1,num2);
    }

    public static void numInter(int num1, int num2){
        int mayor = num1 > num2 ? num1 : num2;
        int menor = num1 < num2 ? num1 : num2;

        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }
}
