package Unidad4.EjerciciosResueltos;

import java.util.Scanner;

public class Actividad4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura;
        byte opcion;

        System.out.println("Indique lo que quiere calcular: ");
        System.out.println("1. Volumen");
        System.out.println("2. Área");
        System.out.print("Opción seleccionada-> ");
        opcion = sc.nextByte();

        System.out.print("Introduzca el radio base del cilindro: ");
        base = sc.nextDouble();

        System.out.print("Introduce la altura del cilindro: ");
        altura = sc.nextDouble();

        calculoAreaVol(base, altura,opcion);

    }

    public static void calculoAreaVol(double radBase, double altura, byte opcion){
        switch (opcion){
            case 1 ->{
                double volumen = Math.PI * Math.pow(radBase,2) * altura;
                System.out.println("El volumen del cilindro es: " + volumen);
            }
            case 2 -> {
                double area = (2*Math.PI)*radBase*(radBase+altura);
                System.out.println("El área del cilindro es: " + area);
            }
            default -> System.out.println("Introduzca un valor entre 1 y 2");
        }
    }
}
