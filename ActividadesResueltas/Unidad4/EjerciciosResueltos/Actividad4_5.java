package Unidad4.EjerciciosResueltos;

import java.util.Scanner;

public class Actividad4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vocal = "";

        System.out.println("Introduzca una letra -> ");
        vocal = sc.nextLine();

        boolean resutl = esVocal(vocal);

        System.out.println("La letra introducida por el usuario " + vocal + " es vocal: " + resutl);

    }

    public static boolean esVocal(String vocal){
        boolean resultado;
        if (vocal.equals("a") || vocal.equals("e") || vocal.equals("i")|| vocal.equals("o") || vocal.equals("u") || vocal .equals("A")|| vocal .equals("E") || vocal.equals("I") || vocal.equals("O") || vocal.equals("U")){
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
}
