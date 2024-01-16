package Unidad_1;

import java.util.Scanner;

public class Actividad1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;
        int redondeo;

        System.out.print("Introduzca un numero con decimales ->");
        num = sc.nextDouble();

        redondeo = (int) ( num + 0.5);

        System.out.print( num +" redondeado es: " + redondeo);



    }
}
