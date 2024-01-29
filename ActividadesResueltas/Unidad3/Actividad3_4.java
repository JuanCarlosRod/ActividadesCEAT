package Unidad3;

import java.util.Scanner;

public class Actividad3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alturaArbol, arbolMasAlto = 0, numEtiqueta = 0, etiquetaMasAlto = 0;


        System.out.print("Altura del árbol (" + numEtiqueta + "):");
        alturaArbol = sc.nextInt();

        while (alturaArbol != -1){
            if (alturaArbol > arbolMasAlto){
                arbolMasAlto = alturaArbol;
                etiquetaMasAlto = numEtiqueta;
            }
            numEtiqueta++;

            System.out.print("Altura del árbol (" + numEtiqueta + "):");
            alturaArbol = sc.nextInt();
        }

        if(arbolMasAlto == -1) {
            System.out.println("No hay ningún árbol");
        } else {
            System.out.println("El árbol mas alto mide: " + arbolMasAlto + " centímetros");
            System.out.println("Etiqueta del árbol: " + etiquetaMasAlto);
        }
    }
}
