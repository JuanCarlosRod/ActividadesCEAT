package Unidad3;

import java.util.Scanner;

public class Actividad3_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Indica cuantos nº de \uD83D\uDCA3 tendra el triángulo -> ");
        int num= sc.nextInt();

        for (int fila = 1; fila<= num; fila++){
            for (int colum = fila; colum <= num; colum++){
                System.out.print("\uD83D\uDCA3");
            }
            System.out.println(" ");
        }

    }
}
