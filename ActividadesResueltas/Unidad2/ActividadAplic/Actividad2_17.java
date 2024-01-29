package Unidad2.ActividadAplic;

import java.util.Scanner;

public class Actividad2_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRand1, numRand2, resupuestaUser;

        numRand1 = (int) (Math.random()*100+1);
        numRand2 = (int) (Math.random()*100+1);

        System.out.println("RESPONDE A LA SUMA!!");
        System.out.println("   "+numRand1);
        System.out.println("+  "+ numRand2);
        System.out.println("________");
        System.out.print("  ");
        resupuestaUser = sc.nextInt();

        if (resupuestaUser != (numRand1+numRand2)){
            System.err.println("¡¡¡Incorrecto!!!");
        }else {
            System.out.println("¡¡¡Correcto!!!");
        }
    }
}
