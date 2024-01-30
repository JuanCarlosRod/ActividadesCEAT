package Unidad3;

import java.util.Scanner;

public class Actividad3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, suma = 0;
        double media;

        for (int i = 1; i <= 10; i++ ){
            System.out.print("Introduce 1 nota -> ");
            num= sc.nextInt();

            suma += num;
        }

        media = suma/10;

        System.out.println("La media de notas es: " + media);


    }
}
