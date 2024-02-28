package Unidad4.EjerciciosResueltos;

import java.util.Scanner;

public class Actividad4_8 {
    public static void main(String[] args) {
       int num1, num2;
       Scanner sc = new Scanner(System.in);
       int opcion = menuCalc();

       System.out.println("Introduce el primer número -> ");
       num1 = sc.nextInt();

       System.out.println("Introduce el segundo número -> ");
       num2 = sc.nextInt();

       double respuesta = calculadora(num1,num2, opcion);
    }

    public static int menuCalc(){
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("***** MENU CALCULADORA *****");
        System.out.println("** 1. SUMA                **");
        System.out.println("** 2. RESTA               **");
        System.out.println("** 3. MULTIPLICACIÓN      **");
        System.out.println("** 4. DIVISIÓN            **");
        System.out.println("** 5.SALIR                **");
        System.out.println("****************************");
        System.out.println("");
        System.out.print("Respuesta -> ");
        opcion = sc.nextInt();

        return opcion;
    }

    public static double calculadora(int num1, int num2, int opcion){
        switch (opcion) {

            case 1 -> {
                int res = num1 + num2;
            }
        }
        return 0;
    }
}
