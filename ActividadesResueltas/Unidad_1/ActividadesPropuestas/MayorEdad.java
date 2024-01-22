package Unidad_1.ActividadesPropuestas;

import java.util.Scanner;

public class MayorEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        boolean mayorEdad;

        System.out.print("Introduce tu edad -> ");
        edad = sc.nextInt();

        mayorEdad = edad >= 18 ? true : false;

        if (mayorEdad){
            System.out.println( "Puedes entrar en la discoteca");
        }else {
            System.out.println( "Vete a dormir máquina");
        }
    }
}
