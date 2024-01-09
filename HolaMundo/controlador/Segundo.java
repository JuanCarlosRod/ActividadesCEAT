package controlador;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Segundo {


    public static void main(String[] args) {

        String name = "Juan Carlos";
        String secondName = "Rodríguez";
        String thirdName = "García";

        LocalDate fechaHoy = LocalDate.now();
        LocalTime hora= LocalTime.now();

        int a = 21;
        int b = 12;
        int c = a + b;

        final int MAYOREDAD = 18;

        Double calculoElevado = Math.pow(3,5);
        Double calculoRaiz = Math.sqrt(16);

        Scanner sc = new Scanner(System.in);

        System.out.println("");

        System.out.println("CONCANETACIONES Y FECHAS");//Concanetaciones, fechas, horas

        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Mi nombre es: " + name.toUpperCase() + " " + secondName.toUpperCase() + " " + thirdName.toUpperCase() + ", a fecha " + fechaHoy);
        System.out.println("Mi nombre es: " + name.toLowerCase() + " " + secondName.toLowerCase() + " " + thirdName.toLowerCase() + ", a fecha " + fechaHoy);

        System.out.println("La hora en ejecución es: " + hora);
        System.out.println("");

        System.out.println("OPERACIONES MATEMATICAS"); // Operaciones Matemáticas

        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("El valor de c es igual a: " + c);

        c = c - b ;

        System.out.println("El nuevo valor de c es igual a : " + c);

        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Calculo elevado = " + calculoElevado);
        System.out.println("Raiz Cuadrada = " + calculoRaiz);

        System.out.println("");

        System.out.println("ENTRADA DE DATOS");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

//        System.out.print("Escribe tu nombre -> ");
//        String nombreUsuario = sc.nextLine();
//
//        System.out.print("Escribe tu edad ->" );
//        int edadUsuario = sc.nextInt();
//
//        System.out.print("Indica el año de tu nacimiento -> ");
//        int añoNacimiento = sc.nextInt();
//        int añoActual = fechaHoy.getYear();
//        int edadUsuarioCalc = añoActual - añoNacimiento;
//
//        System.out.println("");
//        System.out.println("Resultados:");
//
//        System.out.println("Nombre de Usuario: " + nombreUsuario);
//        System.out.println("Edad de Usuario: " + edadUsuario);
//        System.out.println("Edad Usuario calculada:" + edadUsuarioCalc);
//
//        int nuevaEdad= edadUsuario+1;
//
//        System.out.println("El año que viene tendras " + nuevaEdad + " años");

        System.out.print("Indica el precio de un Artículo -> ");

        double precio = sc.nextDouble();

        System.out.println("El precio Introducido es: " + precio + "€");



    }
}
