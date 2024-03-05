package Unidad4;

import java.util.Scanner;

public class CalcuIMC {
//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args) {
//        menu();
//    }
//
//    public static void menu(){
//        int respuesta;
//
//        System.out.println("________CALCULO__IMC________");
//        System.out.println("|                          |");
//        System.out.println("|      1- CALCULAR         |");
//        System.out.println("|      2- SALIR            |");
//        System.out.println("|__________________________|");
//        System.out.println("");
//        System.out.println("Respuesta ---> ");
//        respuesta = sc.nextInt();
//
//        tratoResp(respuesta);
//    }
//
//    public static void tratoResp(int opcion){
//
//    }
    static Scanner sc=new Scanner (System.in);

    public static void main(String[] args) {
                int respuesta;

        System.out.println("________CALCULO__IMC________");
        System.out.println("|                          |");
        System.out.println("|      1- CALCULAR         |");
        System.out.println("|      2- SALIR            |");
        System.out.println("|__________________________|");
        System.out.println("");
        System.out.println("Respuesta ---> ");
        respuesta = sc.nextInt();

//        tratoResp(respuesta);
//        pedirDatos();
    }

    public static void IMC (double kilos, double altura){
        double imc;
        imc=kilos/Math.pow(altura,2);

        System.out.println("El IMC es " + imc);

        clasificacion(imc);
    }

    public static void pedirDatos() {
        System.out.print("Peso -> ");
        double kilos=sc.nextDouble();

        System.out.print("Altura (metros)-> ");
        double altura=sc.nextDouble();

        IMC(kilos, altura);
    }

    public static void clasificacion(double imc){
        if (imc<18.5){
            System.out.println("Tu IMC es bajo");//Peso inferior
        }
        if (imc>=18.5 && imc<=24.9){
            System.out.println("Tu IMC es normal");
        }
        if (imc>=25 && imc<=29.9){
            System.out.println("Tu IMC es superior al normal");
        }
        if (imc>=30){
            System.out.println("Tienes obesidad");
        }
    }

}
