package Unidad3.ActividadesAplic;

import java.util.Scanner;

public class Actividad3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = 0, base = 1;

        System.out.println("Indica el número binario para convertirlo en decimal -> ");
        int binario = sc.nextInt();

        while(binario != 0){
            int unidadBinaria = binario%2;
            binario/= 10;
            decimal += base * unidadBinaria;
            base*=2;
        }
        System.out.println("El número binario en decimal es -> " + decimal);
    }
}
