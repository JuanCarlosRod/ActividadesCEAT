package Unidad2;

import java.util.Scanner;

public class Actividad2_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diasDelMes=0;
        int dia, mes, anio;

        System.out.print("Introduzca día-> ");
        dia = sc.nextInt();

        System.out.print("Introduzca mes-> ");
        mes = sc.nextInt();

        System.out.print("Introduzca año-> ");
        anio = sc.nextInt();

        diasDelMes = switch(mes) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };

        dia++;

        if (dia > diasDelMes) {
            dia = 1;
            mes++;

            if (mes > 12) {
                mes = 1;
                anio++;
            }
        }

        if (anio == 0) {
            anio = 1;
        }

        System.out.println(dia + "/" + mes + "/" + anio);
    }
}
