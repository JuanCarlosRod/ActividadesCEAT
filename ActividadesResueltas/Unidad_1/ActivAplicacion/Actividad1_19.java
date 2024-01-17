package Unidad_1.ActivAplicacion;

import java.util.Scanner;

public class Actividad1_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double entrinf = 15.50, entrAdul = 20, decu = 0.05;

        System.out.print("Introduzca las entradas de niños que desea -> ");
        double infantil = sc.nextDouble();

        System.out.print("Introduzca las entradas de afultos que desea -> ");
        double adulto = sc.nextDouble();

        double totalAdul = adulto * entrAdul;

        if (totalAdul >= 100){
            double destotalAdul = totalAdul * decu;
            totalAdul = totalAdul - decu;

            System.out.println("El precio adulto con descuento es de: " +totalAdul + "€");
        }

        double precioFinal = totalAdul + (infantil*entrAdul);

        System.out.println("El precio total de las entradas es de: " +precioFinal + "€");
    }
}
