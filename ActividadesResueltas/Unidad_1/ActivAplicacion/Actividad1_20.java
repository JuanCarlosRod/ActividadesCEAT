package Unidad_1.ActivAplicacion;

import java.util.Scanner;

public class Actividad1_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        double result;

        System.out.print("Introduzca un número real ->");
        num = sc.nextInt();

        result = Math.sqrt(num);

        System.out.println("La raiz cuadrada de " + num + " es: " + result);
    }
}
