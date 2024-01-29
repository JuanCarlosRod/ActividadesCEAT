package Unidad2.ActividadAplic;

import java.util.Scanner;

public class Actividad2_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operador = "";
        int numRand1, numRand2, resupuestaUser, operRando, respuesta = 0;

        numRand1 = (int) (Math.random()*100+1);
        numRand2 = (int) (Math.random()*100+1);
        operRando = (int) (Math.random()*3+1);

        switch (operRando){
            case 1 -> {

                operador = "+";
                respuesta = numRand1 + numRand2;
            }
            case 2 -> {

                operador = "-";
                respuesta = numRand1 - numRand2;
            }
            case 3 -> {

                operador = "*";
                respuesta = numRand1 * numRand2;
            }
        }


        System.out.println("RESPONDE A LA OPERACION!!");
        System.out.println("   "+numRand1);
        System.out.println(operador + "  "+ numRand2);
        System.out.println("_________");
        System.out.print("  ");
        resupuestaUser = sc.nextInt();

        if (resupuestaUser != respuesta){
            System.err.println("¡¡¡Incorrecto!!!");
        }else {
            System.out.println("¡¡¡Correcto!!!");
        }
    }
}
