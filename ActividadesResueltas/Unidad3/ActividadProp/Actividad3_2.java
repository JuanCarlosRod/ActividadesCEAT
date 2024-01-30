package Unidad3.ActividadProp;

import java.util.Scanner;

public class Actividad3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int veces = 0;

        System.out.print("Introduce el número de veces que se tiene que repetir -> ");
        veces = sc.nextInt();

        for (int i = 1; i<= veces; i++){
            System.out.println("Eco...");
        }
    }
}
