package Unidad3.ActividadProp;

import java.util.Scanner;

public class Actividad3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte edad, edadMin, edadMax;
        System.out.print("Introduzca su edad -> ");
        edad = sc.nextByte();

        edadMin = edad;
        edadMax = edad;

        while (edad != -1){
            if(edadMin > edad){
                edadMin = edad;
            }
            if (edadMax < edad){
                edadMax = edad;
            }
            System.out.print("Introduzca su edad -> ");
            edad = sc.nextByte();
        }

        System.out.println("La edad mínima va a ser de -> " + edadMin +" años");
        System.out.println("La edad máxima va a ser de -> " + edadMax + " años");

    }
}
