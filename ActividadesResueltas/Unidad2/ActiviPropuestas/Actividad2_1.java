package Unidad2.ActiviPropuestas;

import java.util.Scanner;

/*
*Análisis: Para ser Par, tenemos que calcular el módulo (%) al número leído
* y si cumple el resultado == 0, es par si no es impar.
 */

public class Actividad2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduce un número para comprobar si es par -> ");
        num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("El número es Par");
        }else {
            System.out.println("El número es Impar");
        }
    }
}
