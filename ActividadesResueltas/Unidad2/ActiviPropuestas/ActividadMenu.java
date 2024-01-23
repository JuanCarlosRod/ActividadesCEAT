package Unidad2.ActiviPropuestas;

import java.util.Scanner;

public class ActividadMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double num1 = 0, num2 = 0, resultado = 0;

        System.out.println("_______________________________");
        System.out.println("__   Menu Opciones Cálculo   __");
        System.out.println("__                           __");
        System.out.println("__   1. Suma                 __");
        System.out.println("__   2. Resta                __");
        System.out.println("__   3. Multiplicacion       __");
        System.out.println("__   4. División             __");
        System.out.println("__   5. Salir                __");
        System.out.println("_______________________________");

        System.out.print("Introduce una Opción -> ");
        opcion = sc.nextInt();

        if (opcion >= 1 && opcion <= 4 ){
            System.out.print("Introduce el primer número -> ");
            num1 = sc.nextDouble();

            System.out.print("Introduce el segundo número -> ");
            num2 = sc.nextDouble();
        }

        switch (opcion) {
            case 1 -> resultado = num1 + num2;
            case 2 -> resultado = num1 - num2;
            case 3 -> resultado = num1 * num2;
            case 4 -> resultado = num1 / num2;
            case 5 -> System.out.println("Saliendo del Menu...");
            default -> System.out.println("Introduce un número válido");
        }

        if (resultado != 0){
            System.out.println("Resultado de la operacion ->" + resultado);
        }

    }
}
