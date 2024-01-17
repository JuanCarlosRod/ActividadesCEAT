package Unidad_1.ActivAplicacion;

import java.util.Scanner;

public class Actividad1_14 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double base, altura;

        System.out.print("Introduce la altura del triángulo -> ");
        altura = sc.nextDouble();

        System.out.print("Introduce la base del triángulo -> ");
        base = sc.nextDouble();

        double area = (base*altura)/2;

        System.out.println("El Área resultante sera de: " + area);
    }
}
