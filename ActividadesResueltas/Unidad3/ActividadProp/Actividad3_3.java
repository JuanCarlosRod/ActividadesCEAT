package Unidad3.ActividadProp;

import java.util.Scanner;

public class Actividad3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unidad = 0;
        System.out.print("Indica el Número positivo y lo mostraré guarismo -> ");
        int num = sc.nextInt();
        int numFor = num;

        //Para mostrarlo voy a calcular el unidad%10 y luego lo divido /10 hasta que el numero sea 0
        System.out.println("*****WHILE*****");
        while (num > 0){
            unidad = num%10;
            System.out.println(unidad);
            num/=10;
        }

        //con bucle for
        System.out.println("");
        System.out.println("******FOR******");
        for (int i = numFor; i >0; i/=10 ){
            System.out.println(i%10);
        }
    }
}
