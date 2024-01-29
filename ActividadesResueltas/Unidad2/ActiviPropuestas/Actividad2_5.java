package Unidad2.ActiviPropuestas;

import java.util.Scanner;

public class Actividad2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioEntr, recaudacion;
        int aforoMax, entradVend;

        System.out.print("Indique el precio de la entrada -> ");
        precioEntr = sc.nextDouble();

        System.out.print("Indique el aforo máximo del local -> ");
        aforoMax = sc.nextInt();

        System.out.print("Indique el número de entradas vendidas -> ");
        entradVend = sc.nextInt();

        recaudacion = precioEntr * entradVend;

        if (entradVend > aforoMax) {
            System.out.println("Se cancela el concierto por OverBooking");
        } else {
            if (entradVend <= (aforoMax * 0.2)){
                System.out.println("El concierto se ha cancelado");
            } else {
                if (entradVend < (aforoMax * 0.5)){
                    precioEntr = precioEntr - (precioEntr * 0.25);
                    recaudacion = precioEntr * entradVend;
                    System.out.println("Se ha aplicado un descuento del 25% a las entradas por no superar 50% aforo -> " + precioEntr + "€");
                    System.out.println("La recaudacion final sera de " + recaudacion + "€");
                } else {
                    System.out.println("Concierto transcurre con normalidad");
                    System.out.println("Recaudacion final -> " + recaudacion + "€");
                }
            }
        }
    }
}
