package Unidad_1.ActivAplicacion;

import java.util.Scanner;

public class Actividad1_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seg, min, horas, seg2;

        System.out.print("Introduce un número de segundos ->");
        seg = sc.nextInt();

        horas = seg/3600;
        min = (seg%3600)/60;
        seg2 = seg % 60;

        String timeString = String.format("%02d:%02d:%02d", horas, min, seg2);
        System.out.println("Hora convertida: " + timeString);

    }

}
