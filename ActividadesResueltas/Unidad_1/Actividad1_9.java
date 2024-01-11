package Unidad_1;

import java.util.Scanner;

public class Actividad1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduce un número -> ");
        num = sc.nextInt();

        boolean resultado = ( num%2 ) == 0;

        if (resultado == true){
            System.out.println("El resultado es Par: " + resultado);
        } else {
            System.out.println("El resultado es Impar: " + resultado);
        }

    }
}
