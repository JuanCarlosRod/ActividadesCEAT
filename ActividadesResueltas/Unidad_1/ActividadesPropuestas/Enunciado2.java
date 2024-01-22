package Unidad_1.ActividadesPropuestas;

import java.util.Scanner;

public class Enunciado2 {

    //En una tienda, se requiere calcular el porcentaje de descuento de un producto, por lo que debes solicitar el precio
    //del producto y el porcentaje a aplicar, calcular el precio total.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioProd, porcentaje, porcentajePrecio, precioTotal;

        System.out.print("Introduzca el precio del producto -> ");
        precioProd = sc.nextDouble();

        System.out.print("Introduzca el valor del porcentaje -> ");
        porcentaje = sc.nextDouble();

        porcentajePrecio = (precioProd*porcentaje)/100;

        precioTotal = precioProd - porcentajePrecio;

        System.out.println("El precio final del producto será: " + precioTotal);
    }
}
