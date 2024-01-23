package Unidad2;

import java.util.Scanner;

public class Actividad2_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora, mint, seg;

        System.out.print("Introduce la hora ->");
        hora = sc.nextInt();

        System.out.print("Introduce los minutos ->");
        mint = sc.nextInt();

        System.out.println("Introduce los segundos -> ");
        seg = sc.nextInt();

        seg++;

        if (seg >59) {
            seg = 0;
        }


    }
}
