package Unidad4.EjerciciosResueltos;

import java.util.Scanner;

public class Actividad4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;

        System.out.print("Introduce el valor 1 -> ");
        valor1 = sc.nextInt();

        System.out.print("Introduce el valor 2 -> ");
        valor2 = sc.nextInt();

        int valorDefMax = valorMax(valor1, valor2);
        int valorDefMin = valorMin(valor1, valor2);

        System.out.println("El valor máximo es: " + valorDefMax);
        System.out.println("El valor minimo es: " + valorDefMin);
    }

    public static int valorMax(int valor1, int valor2){
        return Math.max(valor1,valor2);
    }

    public static int valorMin(int valor1, int valor2){
        return Math.min(valor1,valor2);
    }
}
