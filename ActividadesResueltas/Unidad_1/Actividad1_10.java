package Unidad_1;

import java.util.Scanner;

public class Actividad1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean lloviendo, tareas, biblioteca, salir;

        System.out.print("¿Está lloviendo? (true/false) ->");
        lloviendo = sc.nextBoolean();

        System.out.print("¿Has finalizado tus tareas? (true/false) ->");
        tareas = sc.nextBoolean();

        System.out.print("¿Debes ir a la biblioteca? (true/false) ->");
        biblioteca = sc.nextBoolean();

        salir = !lloviendo && tareas || biblioteca;

        //System.out.println("¿Puede salir a la calle? " + salir);

        if (salir) {
            System.out.println("Puedes salir!");
        } else  {
            System.out.println("No se cumplen los requisitos para salir");
        }
    }
}
