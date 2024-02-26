package Unidad4.EjerciciosResueltos;

import java.util.Scanner;

public class Actividad4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int veces;

        System.out.print("Introduce el nº de veces que hará eco: ");
        veces = sc.nextInt();

        funEco(veces);
    }

    public static void funEco(int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println("Eco...");
        }
    }
}
