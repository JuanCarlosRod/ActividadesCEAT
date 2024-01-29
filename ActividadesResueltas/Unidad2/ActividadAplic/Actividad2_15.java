package Unidad2.ActividadAplic;

import java.util.Scanner;

public class Actividad2_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura, resultado;

        System.out.print("Introduce el numero de la base -> ");
        base = sc.nextDouble();

        System.out.print("Introduce el numero de la altura -> ");
        altura = sc.nextDouble();

        if (base < 0 && altura < 0){
            System.out.println("Los números deben ser positivos");
        } else{
            resultado = (base * altura) / 2;

            System.out.println("El área del triángulo es " + resultado);
        }
    }
}
