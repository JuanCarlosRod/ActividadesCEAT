package Unidad3;

import java.util.Scanner;

public class Actividad3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;


        int numeroAleatorio = (int) (Math.random()*100+1);

        System.out.print("Adivina el número aleatorio del 1 al 100->");
        num = sc.nextInt();

        while (num != numeroAleatorio && num != -1){
            if (num < numeroAleatorio){
                System.out.println("Mas alto!!");
            }
            if (num > numeroAleatorio){
                System.out.println("Menos alto!!");
            }
            System.out.print("Mala suerte, vuelve a intentar -> ");
            num = sc.nextInt();
        }

        if (num != numeroAleatorio){
            System.out.println("Mala suerte el numero era: " + numeroAleatorio);
        } else {
            System.out.println("Felicidades has acertado!!!");
        }
    }
}
