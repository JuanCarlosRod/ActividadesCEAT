package Unidad3.ActividadProp;

import java.util.Scanner;

public class SalidasAnticipadas {
    public static void main(String[] args) {
        /*
        * Ejemplo: Indica la edad para entrar al pub, solo pueden entrar los mayores de 18, y quiero saber cuantas personas han entrado porque el aforo es de 100 personas.
        *
        * Indica la edad -> si es menor de 18 no entra y no cuenta, si es mayor y el aforo lo permite, entra, sino....
        * el programa se interrumpe porque no puede tener dentro del local mas de 10 personas
        * */

        //PRUEBA PARA EL BREAK
        /**
         * Scanner sc = new Scanner(System.in);
         *         int edad, menores = 0;
         *
         *for (int i = 1; i <= 10; i++){
         *             System.out.print("Introduce la edad -> ");
         *             edad = sc.nextInt();
         *             if (edad < 18){
         *                 System.out.println("No tiene permitido la entrada");
         *                 i--;
         *                 menores++;
         *             }
         *             if (i == 10){
         *                 System.out.println("*Aforo máximo alcanzado*");
         *                 System.out.println("Han intentado entrar " + menores + " menores de edad");
         *                 break;
         *             }
         *
         *         }
         */


        //PRUEBA PARA EL CONTINUE
        Scanner sc = new Scanner(System.in);
        String nombres = "";
        String todosNombres ="";
        for (int i = 1; i<=14; i++){
            System.out.print("Indica tu nombre -> ");
            nombres = sc.nextLine();

            if (nombres.equals("Manuel") || nombres.equals("manuel")){
                continue;
            }
            todosNombres += i + ". "+ nombres + "\n";
        }

        System.out.println("ALUMNOS \n" +todosNombres);
    }
}
