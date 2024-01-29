package Unidad1.ActivAplicacion;

import java.util.Scanner;

public class Actividad1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base, ivaPrec, resultado;
        final int IVA = 21;

        System.out.print("Introduce la base imponible del Producto -> ");
        base = sc.nextDouble();

        ivaPrec = ((base*IVA)/100);
        resultado = base + ivaPrec;

        System.out.println("El valor de iva aplicado sera de: " + ivaPrec + "€");
        System.out.println("El precio final sera de: " + resultado + "€");


    }
}
