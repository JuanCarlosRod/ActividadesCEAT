package Unidad2.ActividadAplic;

import java.util.Scanner;

public class Actividad2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean capicua = false;
        int num, unid, decen, centen, millar;

        System.out.print("Introduzca un número comprendido entre 0 y 9.999 -> ");
        num = sc.nextInt();

        unid = num % 10;
        num = num/10;
        decen = num % 10;
        num = num / 10;
        centen = num % 10;
        num = num/ 10;
        millar = num;

        if ( millar == unid && decen == centen){
            capicua = true;
        } else if (millar == 0 && centen == unid) {
            capicua = true;
        } else if (millar == 0 && centen == 0 && decen == unid){
            capicua = true;
        } else if (millar == 0 && centen == 0 && decen == 0){
            capicua = true;
        }

        if (capicua){
            System.out.println("El número es capicua");
        } else {
            System.out.println("El número no es capicua");
        }

    }
}
