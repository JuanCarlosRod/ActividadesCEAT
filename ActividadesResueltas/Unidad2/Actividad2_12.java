package Unidad2;

import java.util.Scanner;

public class Actividad2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anio;
        boolean fechaCorrect;

        System.out.print("Introduce un número de día -> ");
        dia = sc.nextInt();

        System.out.print("Introduce un número de mes -> ");
        mes = sc.nextInt();

        System.out.print("Introduce un año ->");
        anio = sc.nextInt();

        if (dia == 0 || mes == 0 || anio == 0){
            System.out.println("Introduce una fecha correcta");
            fechaCorrect = false;
        } else {
            if( mes == 2 && (1 <= dia && dia <= 28)){
                fechaCorrect = true;
            } else {
                if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && (1 <= dia && dia <= 30)){
                    fechaCorrect = true;
                } else {
                    if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes== 12 && (1 <= dia && dia <= 31)){
                        fechaCorrect = true;
                    } else {
                        fechaCorrect = false;
                    }
                }
            }
        }
        if (fechaCorrect){
            System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + anio);
        } else {
            System.out.println("Fecha incorrecta");
        }
    }
}
