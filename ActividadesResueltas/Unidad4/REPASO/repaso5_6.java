package Unidad4.REPASO;

import java.util.Arrays;
import java.util.Scanner;

public class repaso5_6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int combinacionGanadora[] = new int[6];
        int numero;
        int indice= 1;

        for (int i = 0; i < combinacionGanadora.length; i++) {
            //si el random saca 2 numeros iguales es un error por lo que hay que validar.
            numero = (int)(Math.random()*49+1);
            //hay que hacer una busqueda en el array para comprobar

            while(indice < combinacionGanadora.length && combinacionGanadora[indice] != numero){
               indice++;
            }
        }
    }

}
