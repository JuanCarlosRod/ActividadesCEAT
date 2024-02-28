package Unidad4.EjerciciosResueltos;

import java.util.Scanner;

public class Actividad4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número -> ");
        int num = sc.nextInt();

        System.out.println("Numero de divisores primos -> " + numDivisoresPrimos(num));

    }

    public static boolean esPrimo(int num){
        boolean primo = true;
        int i = 2;

        if (num < 2) {
            primo = false;
        }

        while (i<num && primo == true){
            if (num % i== 0){
                primo = false;
            }
            i++;
        }
        return primo;
    }

    public static int numDivisoresPrimos(int num){
        int cont = 1;

        for (int i = 2; i <= num ; i++) {
            if (esPrimo(i) && num % i == 0){
                cont++;
            }
        }
        return cont;
    }

}
