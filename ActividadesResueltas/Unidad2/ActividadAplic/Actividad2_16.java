package Unidad2.ActividadAplic;

import java.util.Scanner;

public class Actividad2_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, respuesta;

        System.out.print("Introduce un número -> ");
        num = sc.nextInt();

        respuesta = num > 0 ? num : num * (-1);

        System.out.println("El valor absoluto de " + num + " es " + respuesta);
    }
}
