package Unidad1.ActivAplicacion;

import java.util.Scanner;

public class Actividad1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, prox;

        System.out.print("Introduzca un número ->");
        num = sc.nextInt();

        prox = 7 - num % 7;

        System.out.println("Número a sumar: "+ prox);

    }
}
