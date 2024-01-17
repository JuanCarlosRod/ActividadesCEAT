package Unidad_1.ActivAplicacion;

import java.util.Scanner;

public class Actividad1_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mm, ctm, m, total;

        System.out.print("Introduzca una medida en mm -> ");
        mm = sc.nextDouble();

        System.out.print("Introduzca una medida en ctm -> ");
        ctm = sc.nextDouble();

        System.out.print("Introduzca una medida en m -> ");
        m = sc.nextDouble();

        total = (0.1 * mm ) + ctm + (m * 10);

        System.out.println("La distancia total es : " + total + " centímetros");
    }
}
