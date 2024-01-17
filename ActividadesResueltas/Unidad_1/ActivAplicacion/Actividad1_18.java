package Unidad_1.ActivAplicacion;

import java.util.Scanner;

public class Actividad1_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int patHorm = 6, pataAra = 8, pataCoch = 14, horCap, araCap, cochCap, totalPat;

        System.out.print("Introduzca las hormigas capturadas -> ");
        horCap = sc.nextInt();

        System.out.print("Introduzca las arañas capturadas -> ");
        araCap = sc.nextInt();

        System.out.print("Introduzca las cochinillas capturadas -> ");
        cochCap = sc.nextInt();

        totalPat = (patHorm*horCap)+ (araCap * pataAra) + (cochCap * pataCoch);

        System.out.println("El número total de patas es: " +totalPat);

    }
}
