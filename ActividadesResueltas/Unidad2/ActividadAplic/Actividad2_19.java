package Unidad2.ActividadAplic;

import java.util.Scanner;

public class Actividad2_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gradosUser, restGrados, radiant;
        System.out.println("Introduzca los grados -> ");
        gradosUser = sc.nextDouble();
        if(gradosUser > 360){
            restGrados = gradosUser % 360;
            radiant = (restGrados * Math.PI)/180;
            System.out.println("Los radiantes de " + gradosUser + " son " + radiant);
        } else {
            radiant = (gradosUser * Math.PI)/180;
            System.out.println("Los radiantes de " + gradosUser + " son " + radiant);
        }
    }
}
