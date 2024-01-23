package Unidad2;

import java.util.Scanner;

public class Actividad2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.print("Introduce tu nota (número entero) -> ");
        nota = sc.nextInt();

        switch (nota) {
            case 0, 1, 2, 3, 4 -> System.out.println("Suspenso");
            case   5  -> System.out.println("Suficiente");
            case   6  -> System.out.println("Bien");
            case 7, 8 -> System.out.println("Notable");
            case 9,10 -> System.out.println("Sobresaliente");
        }
    }
}
