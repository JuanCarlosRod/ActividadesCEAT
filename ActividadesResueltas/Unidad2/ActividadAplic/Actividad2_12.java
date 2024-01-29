package Unidad2.ActividadAplic;

import java.util.Scanner;

public class Actividad2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, letra;

        System.out.print("Introduzca su nº de DNI -> ");
        num = sc.nextInt();

        letra = num%23;

        switch (letra){
            case 0 -> System.out.println(num+ "T");
            case 1 -> System.out.println(num+ "R");
            case 2 -> System.out.println(num+ "W");
            case 3 -> System.out.println(num+ "A");
            case 4 -> System.out.println(num+ "G");
            case 5 -> System.out.println(num+ "M");
            case 6 -> System.out.println(num+ "Y");
            case 7 -> System.out.println(num+ "F");
            case 8 -> System.out.println(num+ "P");
            case 9 -> System.out.println(num+ "D");
            case 10 -> System.out.println(num+ "X");
            case 11 -> System.out.println(num+ "B");
            case 12 -> System.out.println(num+ "N");
            case 13 -> System.out.println(num+ "J");
            case 14 -> System.out.println(num+ "Z");
            case 15 -> System.out.println(num+ "S");
            case 16 -> System.out.println(num+ "Q");
            case 17 -> System.out.println(num+ "V");
            case 18 -> System.out.println(num+ "H");
            case 19 -> System.out.println(num+ "L");
            case 20 -> System.out.println(num+ "C");
            case 21 -> System.out.println(num+ "K");
            case 22 -> System.out.println(num+ "E");
            default -> System.err.println("Número de DNI inválido");
        }

    }
}
