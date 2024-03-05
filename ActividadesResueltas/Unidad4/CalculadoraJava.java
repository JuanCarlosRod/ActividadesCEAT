package Unidad4;

import java.util.Scanner;

public class CalculadoraJava {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        System.out.println("_______________________________________");
        System.out.println("|         CALCULADORA JAVA            |");
        System.out.println("|_____________________________________|");
        System.out.println("|         1. SUMAR                    |");
        System.out.println("|         2. RESTAR                   |");
        System.out.println("|         3. MULTIPLICAR              |");
        System.out.println("|         4. DIVIDIR                  |");
        System.out.println("|         5. RAIZ CUADRADA            |");
        System.out.println("|         6. EXPONENCIAL              |");
        System.out.println("|         7. SALIR                    |");
        System.out.println("|                                     |");
        System.out.println("|_____________________________________|");
        System.out.println(" ");
        System.out.println("¿Que opcion quiere seleccionar?");
        byte opcion = sc.nextByte();



        double result = calculadora(opcion);

        System.out.println("Resultado -> " + result);
    }

    public static double calculadora(byte opcion){
        double result = 0;
        int valor1 = 0, valor2 = 0;

        if (opcion == 5){
            System.out.println("Introduce el valor: ");
            valor1 = sc.nextInt();
        }else {
            System.out.print("Introduce el primer valor: ");
            valor1 = sc.nextInt();

            System.out.print("Introduce el segundo valor: ");
              valor2 = sc.nextInt();
        }

        switch (opcion){
            case 1 -> {
                result = valor1 + valor2;
            }
            case 2 -> {
                result = valor1 - valor2;
            }
            case 3 -> {
                result = valor1 * valor2;
            }
            case 4 -> {
                result = valor1 / valor2;
            }
            case 5 -> {
                result = Math.sqrt(valor1);
            }
            case 6 -> {
                result = Math.pow(valor1, valor2);
            }
            case 7 -> {
                System.out.println("Adios.....");
                break;
            }
            default -> System.out.println("Seleccione una opcion correcta");
        }

        return result;
    }

    public static String texto(){
        return "";
    }


}
