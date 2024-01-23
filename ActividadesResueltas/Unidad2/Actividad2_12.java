package Unidad2;

import java.util.Scanner;

public class Actividad2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año;
        boolean fechaCorrect;

        System.out.print("Introduce un número de día -> ");
        dia = sc.nextInt();

        System.out.print("Introduce un número de mes -> ");
        mes = sc.nextInt();

        System.out.println("Introduce un año ->");
        año = sc.nextInt();

        if (dia == 0 || mes == 0 || año == 0){
            System.out.println("Introduce una fecha correcta");
            fechaCorrect = false;
        } else {

        }
    }
}
