package Unidad_1.ActivAplicacion;

import java.util.Scanner;

public class Actividad1_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seg, min, horas;

        System.out.print("Introduce un número de segundos ->");
        seg = sc.nextInt();

        min = (seg%3600)/60;
        horas = seg/3600;

        String timeString = String.format("%02d:%02d:%02d", horas, min, seg);
        System.out.println("Hora convertida: " + timeString);

    }

}
