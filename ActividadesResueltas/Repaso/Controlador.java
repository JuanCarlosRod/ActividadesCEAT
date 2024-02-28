package Repaso;

import java.util.Scanner;

public class Controlador {
    public static void main(String[] args) {
        //Tipos datos -> las declaraciones de las variables tienen que ser llamadas con su tipo de dato. Ej int total;
        int total = 0; // Opcional inicializarlo
        String nombre = "";
        String provincia = "";

        //Luego tenemos las declaraciones de la clase Scanner que nos permite leer
        //la informacion que solicitamos, siempre relacionado con el tipo de dato que se va a introducir

        //Declaracion
        Scanner sc = new Scanner(System.in);

        //Ej: Solicita el Nombre,
        //la poblacion y el numero de habitantes y acumulalo hasta que sean las 5 capitales de provincias de CLM
        //Sumar el total de habitantes de las 5 capitales

        //Bucle for desde 1 hasta 5 y lee los datos
        for(int i=1; i<5; i++){

            System.out.print("Indica tu Provincia -> ");
            provincia = sc.nextLine();

            System.out.print("Indica el nº de habitantes -> ");
            int poblacion = sc.nextInt(); sc.nextLine();

            System.out.print("Indica tu nombre -> ");
            nombre = sc.nextLine();

            //Condicional -> Si el número de habitantes es menor a 20000, indicar que hay un error
            //y restar 1 a i para que vuelva a solicitar la inf.
            if (poblacion < 20000){
                i--;
                System.out.println("La provincia de " + provincia + " tiene mas de " + poblacion + " habitantes");
            } else {
                total += poblacion;
            }
        }

        System.out.println("El número de habitantes de las Provincias de CLM es de " + total);

    }
}
