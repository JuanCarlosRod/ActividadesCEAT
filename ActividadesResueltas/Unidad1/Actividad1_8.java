package Unidad1;

import java.util.Scanner;

public class Actividad1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;

        System.out.print("Introduce tu edad -> ");
        edad = sc.nextInt();

        boolean mayorEdad = edad >= 18;

        if (mayorEdad){
            System.out.println( "Eres mayor de edad");
        }else {
            System.out.println( "Eres menor de edad");
        }
    }
}
