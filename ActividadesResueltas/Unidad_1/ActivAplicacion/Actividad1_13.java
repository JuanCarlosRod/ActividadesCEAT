package Unidad_1.ActivAplicacion;

import java.util.Scanner;

public class Actividad1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, prox;

        System.out.print("Introduzca un número para ser múltiplo ->");
        n = sc.nextInt();

        System.out.print("Introduzca el número del que debe ser múltiplo-> ");
        m = sc.nextInt();

        prox = m - n % m;

        System.out.println("Número a sumar: "+ prox);


    }
}
