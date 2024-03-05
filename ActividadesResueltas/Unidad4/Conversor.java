package Unidad4;

import java.util.Scanner;

public class Conversor {
    static Scanner sc = new Scanner(System.in);

//    public static void main(String[] args) {
//        System.out.println("Indique el importe en euros -> ");
//        double euros = sc.nextDouble();
//
//        menu(euros);
//    }
//
//
//    public static  void menu(double euros){
//        char opcion;
//
//        do{
//        mostrar("*******   MENU CONVERSOR   *******");
//        mostrar("a-> Libras");
//        mostrar("b-> Yenes");
//        mostrar("c-> Dolares EEUU");
//        mostrar("d-> Dolares Canadá");
//        mostrar("x-> Salir");
//        mostrar("Indica la moneda a convertir:");
//        opcion = sc.next().charAt(0);
//
//        switch (opcion){
//            case 'a'->{
//                mostrar(euros + "€ = " + euros*0.8562 + "GBP");
//            }
//            case 'b'->{
//                mostrar(euros + "€ = " + euros*163.24 + " Yenes");
//            }
//            case 'c'->{
//                mostrar(euros + "€ = " + euros*1.0838 + "$ USA");
//            }
//            case 'd'->{
//                mostrar(euros + "€ = " + euros*1.4711 + "$ CANADA");
//            }
//            case 'x'->{
//                System.out.println("¿Estás seguro que quieres salir?");
//                System.out.println("x-> Confirmar");
//                opcion = sc.next().charAt(0);
//                if (opcion!= 'x'){
//                    menu(opcion);
//                }
//            }
//            default -> mostrar("Introduce el valor valido");
//        }
//        }while(opcion != 'x');
//
//    }
//
//    public static void mostrar(String texto){
//        System.out.println(texto);
//    }


        public static void main(String[] args) {
        System.out.println("Indique el importe en kilogramos -> ");
        double kilogramos = sc.nextDouble();

        menu(kilogramos);
    }


    public static  void menu(double kilogramos){
        char opcion;

        do{
        mostrar("*******   MENU CONVERSOR   *******");
        mostrar("a-> Libras");
        mostrar("b-> Toneladas");
        mostrar("c-> Onzas");
        mostrar("d-> Gramos");
        mostrar("e-> Miligramos");
        mostrar("x-> Salir");
        mostrar("Indica la moneda a convertir:");
        opcion = sc.next().charAt(0);

        switch (opcion){
            case 'a'->{
                mostrar(kilogramos + "Kg = " + kilogramos*2.20462 + " libras");
            }
            case 'b'->{
                mostrar(kilogramos + "Kg = " + kilogramos*0.001 + " T");
            }
            case 'c'->{
                mostrar(kilogramos + "Kg = " + kilogramos*35.274 + " Onzas");
            }
            case 'd'->{
                mostrar(kilogramos + "Kg = " + kilogramos*1000 + "g");
            }
            case 'e'->{
                mostrar(kilogramos + "Kg = " + kilogramos*1000000 + "mg");
            }
            case 'x'->{
                System.out.println("¿Estás seguro que quieres salir?");
                System.out.println("x-> Confirmar");
                opcion = sc.next().charAt(0);
                if (opcion!= 'x'){
                    menu(opcion);
                }
            }
            default -> mostrar("Introduce el valor valido");
        }
        }while(opcion != 'x');

    }

    public static void mostrar(String texto){
        System.out.println(texto);
    }


}
