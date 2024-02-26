package Unidad4;

import java.util.Scanner;

public class Explicacion {
    //Pedir valores en las funciones

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int edad;
//        String nombre, apellidos;
//        System.out.print("Introduce tu nombre: ");
//        nombre = sc.nextLine();
//
//        System.out.print("Introduce tus apellidos: ");
//        apellidos = sc.nextLine();
//
//        System.out.print("Introduce tu edad: ");
//        edad = sc.nextInt();
//
//        calcEdad(nombre, apellidos, edad);
//    }
//
//    public static void calcEdad( String nombre, String apellidos, int edad){
//        edad += 10;
//        System.out.println("Buenos dias " + nombre+" "+ apellidos+ " en 10 años tendrás " + edad);
//    }



    //Devolver valores de las funciones
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreUsuario = llamadaNombre(3);
        System.out.println("Tu nombre es " + nombreUsuario);

        System.out.println("Introduce el valor de a: ");
        int a = sc.nextInt();

        System.out.println("Introduce el valor de b: ");
        int b = sc.nextInt();

        int suma = funcionSumar(a,b);

        System.out.println("El resultado de "+ a + "+"+b+" es " + suma);
    }

    public static String llamadaNombre(int contador){
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        System.out.print("Indica el nombre: ");
        nombre = sc.nextLine();

        return nombre;
    }

    public static int funcionSumar(int a, int b){
        return a+b;
    }
}
