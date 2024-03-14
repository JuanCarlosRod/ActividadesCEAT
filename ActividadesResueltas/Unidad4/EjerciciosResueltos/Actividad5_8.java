package Unidad4.EjerciciosResueltos;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int datos[];
        int par[] = new int[0];
        int impar[] = new int[0];

        mostrar("Escriba n: ");
        int n = sc.nextInt();
        datos = new int[n];

        for (int i = 0; i < datos.length; i++) {
            mostrar("Introduzca un numero: ");
            datos[i] = sc.nextInt();
        }

        for(int numero: datos) {
            if (numero % 2 == 0) {
                par = Arrays.copyOf(par, par.length+1);
                par[par.length-1] = numero;
            }else {
                impar = Arrays.copyOf(impar, impar.length+1);
                impar[impar.length-1] = numero;
            }
        }

        mostrar("Pares: " + Arrays.toString(par));
        mostrar("Impares: " + Arrays.toString(impar));

    }

    public static void mostrar(String texto){
         System.out.println(texto);
    }

    public static void mostrarSinLn(String texto){
         System.out.print(texto);
    }
}
