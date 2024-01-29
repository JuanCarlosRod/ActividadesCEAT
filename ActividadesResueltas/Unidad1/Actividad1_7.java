package Unidad1;

import java.util.Scanner;

public class Actividad1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio;

        System.out.print("Introduce el radio de una circunferencia -> ");
        radio = sc.nextDouble();

        double longitud = 2*Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("La longitud de la circunferencia será : " + longitud);
        System.out.println("El área de la circunferencia será: " + area);
    }
}
