package Unidad4.EjerciciosResueltos;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_6 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int combinacionGanadora[] = new int[6];
        int numero;
        for (int i = 0; i < combinacionGanadora.length; i++) {
            //si el random saca 2 numeros iguales es un error por lo que hay que validar.
            numero = (int)(Math.random()*49+1);
            //hay que hacer una busqueda en el array para comprobar

            int indice= 0;
            while(indice < combinacionGanadora.length && combinacionGanadora[indice] != numero){
                indice++;//Se incrementa el indice para ir recorriendo las posiciones del array
            }
            if (indice >= combinacionGanadora.length){
                combinacionGanadora[i] = numero;
            }else {
                i--;
            }
        }

        mostrar("Indica tu apuesta: ");
        int apuesta[] = new int[6];
        for (int i = 0; i < apuesta.length; i++) {
            mostrarSinLn("Número " + (i+1) + "-> ");
            apuesta[i] = sc.nextInt();
        }


        int resultado = primitiva(combinacionGanadora, apuesta);

        if (resultado == 6){
            mostrar("Enhorabuena has ganado");
        }else {
            mostrar("Lo siento has perdido");
            Arrays.sort(combinacionGanadora);
            mostrar(Arrays.toString(combinacionGanadora));
            mostrar("Numero de aciertos en tu apuesta -> " + resultado);
        }


    }

    public static int primitiva(int combinacion[], int apuesta[]){
        int aciertos = 0;
        Arrays.sort(apuesta);
        Arrays.sort(combinacion);

        for (int elemento:apuesta){
            //como la tabla ganadora esta ordenada utilizamos el binarySearch
            if (Arrays.binarySearch(combinacion, elemento) >= 0){
                aciertos++; //Hemos acertado ese numero
            }
        }

        return aciertos;
    }

    public static void mostrar(String texto){
        System.out.println(texto);
    }

    public static void mostrarSinLn(String texto){
        System.out.print(texto);
    }
}
