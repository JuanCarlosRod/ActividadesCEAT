package Unidad1.ActivAplicacion;

import java.util.Scanner;

public class Actividad1_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double metros, cntm = 10;

        System.out.print("¿A qué distancia se ha lanzado el Algoritmo? -> ");
        metros = sc.nextDouble();

        double resul = (int) metros * cntm;

        System.out.println("La distancia lanzada es de: " + resul + " centímetros");
    }
}
