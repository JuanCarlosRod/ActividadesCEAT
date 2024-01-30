package Unidad3;

import java.util.Scanner;

public class Actividad3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Introduce un número -> ");
        n = sc.nextInt();

        for (int i = 0; i <= n; i++){
            System.out.println("Número ->" + i);
        }
    }
}
