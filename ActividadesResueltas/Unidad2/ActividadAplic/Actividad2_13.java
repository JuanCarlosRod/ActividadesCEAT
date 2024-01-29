package Unidad2.ActividadAplic;

import java.util.Scanner;

public class Actividad2_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cantidadCom,kilosPorAnim;
        int numAnimales;

        System.out.print("Introduce cuantos animales tienes -> ");
        numAnimales = sc.nextInt();

        System.out.print("Introduce cuantos kilos de comida tiene -> ");
        cantidadCom = sc.nextDouble();

        System.out.print("Introduce cuanto comen los animales -> ");
        kilosPorAnim = sc.nextDouble();

        if (cantidadCom> numAnimales * kilosPorAnim){
            System.out.println("Tienes suficiete comida para todos");
        } else {
            System.out.println("Falta comida para los animales, hay que ajustar la racion");

            if (numAnimales != 0){
                kilosPorAnim = cantidadCom / numAnimales;

                System.out.println("Cada animal deberá comer " + kilosPorAnim +"kg");
            }else {
                System.out.println("Debe de haber animales para calcular su ración");
            }
        }


    }

}
