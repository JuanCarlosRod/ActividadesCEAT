package Unidad2;

import java.util.Scanner;

public class Actividad2_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora, mint, seg;

        System.out.print("Introduzca hora: ");
        hora = sc.nextInt();

        System.out.print("Introduzca los minutos: ");
        mint = sc.nextInt();

        System.out.print("Introduzca los segundos: ");
        seg = sc.nextInt();
        seg++;

        if (seg > 59) {
            seg = 0;
            mint++;

            if (mint > 59) {
                mint = 0;
                hora++;

                if (hora > 23) {
                    hora = 0;
                }
            }
        }

        System.out.println("Hora + 1 segundo: " + hora + ":" + mint + ":" + seg);
    }
}
