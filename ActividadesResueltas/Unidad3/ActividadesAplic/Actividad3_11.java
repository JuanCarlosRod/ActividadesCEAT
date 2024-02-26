package Unidad3.ActividadesAplic;

import java.util.Scanner;

public class Actividad3_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Indica el número decimal -> ");
        int numero = sc.nextInt();

        while (numero != 0){
            int unidadBinaria = numero%2;
            numero/= 2;
            System.out.println(unidadBinaria);
        }
    }
}
