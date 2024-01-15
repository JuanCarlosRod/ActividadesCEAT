package ActividadesPropuestas;

import java.util.Scanner;

public class Actividad1 {

    //Solicita al usuario que ingrese 2 números enteros
    // y luego muestra la suma de esos 2 números con un mensaje "El resultado de la suma de a + b es ".

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, resut;

        System.out.print("Introduzca el valor del primer número -> ");
        num1 = sc.nextInt();

        System.out.println("Introduzca el valor del segundo número -> ");
        num2 = sc.nextInt();

        resut = num1 + num2;

        System.out.println("El resultado de la suma es: " + resut);
    }
}
