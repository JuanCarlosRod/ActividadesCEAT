package Unidad4.EjerciciosResueltos;

import java.util.Scanner;

public class Actividad4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduzca un número");
        num = sc.nextInt();

        boolean resultFunc = esPrimo(num);

        System.out.println("El numero introducido " + num + " es primo: " + resultFunc);

    }

    public static boolean esPrimo(int num){
        return true;
    }
}
