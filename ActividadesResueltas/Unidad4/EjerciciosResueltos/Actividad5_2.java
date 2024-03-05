package Unidad4.EjerciciosResueltos;

import java.util.Scanner;
/*
* Solicitar un numero, realizar la media de os numeros insertado, la media de los negativos y la cuenta
* de los numeros de 0 introducidos
* */
public class Actividad5_2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mostrar("Indicar el numero de elementos a insertar -> ");
        int longitud = sc.nextInt();
        int contCero = 0, contPos = 0, contNega = 0;
        double media = 0, mediaNegativo = 0;

        int numeros[] = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            mostrar("Indica el elemento Nº" + (i+1) +": ");
            numeros[i] = sc.nextInt();

            if (numeros[i]<0){
                mediaNegativo+= numeros[i];
                contNega++;
            }else if (numeros[i] > 0){
                media += numeros[i];
                contPos++;
            }else {
                contCero++;
            }

            mediaNegativo/= contNega;
            media/=contPos;

            mostrar("La media de los "+ contNega +" negativos " + mediaNegativo);
            mostrar("La media de los "+ contPos +" positivos " + media);
        }
    }

    public static void mostrar(String texto){
        System.out.println(texto);
    }
}
