package Unidad2.ActividadAplic;

import java.util.Scanner;

public class Actividad2_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num;
        String salida = "";
        System.out.print("Ingrese un número entre el 1 y el 99 -> ");
        num = sc.nextByte();

        // 1º OPCION
        //1 -> Switch Números especiales: 11,12,13,14,15,16,17...20
        //2 -> Calculamos las decenas byte unidad= num%10   decenas = num/10  -> switch con las decenas -> 10,20,30,40....90
        //3 -> Si las unidad != 0 creamos condicion que concatena con "y" (treinta "y" uno, cincuenta "y" tres...)
        //4 -> switch de unidades del 1 al 9

        //2º OPCION
        //Hacer un switch del 1 al 99 con todos los posibles resultados

        switch (num){
            case 11 -> salida = "Once";
            case 12 -> salida = "Doce";
            case 13 -> salida = "Trece";
            case 14 -> salida = "Catorce";
            case 15 -> salida = "Quince";
            case 16 -> salida = "Dieciseis";
            case 17 -> salida = "Diecisiete";
            case 18 -> salida = "Dieciocho";
            case 19 -> salida = "Diecinueve";
            case 20 -> salida = "Veinte";
            case 21 -> salida = "Veintiuno";
            case 22 -> salida = "Veintidos";
            case 23 -> salida = "Veintitres";
            case 24 -> salida = "Veinticuatro";
            case 25 -> salida = "Veinticinco";
            case 26 -> salida = "Veintiseis";
            case 27 -> salida = "Veintisiete";
            case 28 -> salida = "Veintiocho";
            case 29 -> salida = "Veintinueve";
            default ->{
                byte unidad =(byte) (num%10);
                int decenas = num/10;

                switch(decenas){
                    case 1 -> salida ="Diez";
                    case 2 -> salida ="Veinte";
                    case 3 -> salida ="Treinta";
                    case 4 -> salida ="Cuarenta";
                    case 5 -> salida ="Cincuenta";
                    case 6 -> salida ="Sesenta";
                    case 7 -> salida ="Setenta";
                    case 8 -> salida ="Ochenta";
                    case 9 -> salida ="Noventa";
                }
                if (decenas >= 3 && unidad != 0){
                    salida += " y ";
                }
                switch (unidad){
                    case 1-> salida = salida + "uno";
                    case 2-> salida = salida + "dos";
                    case 3-> salida = salida + "tres";
                    case 4-> salida = salida + "cuatro";
                    case 5-> salida = salida +"cinco";
                    case 6-> salida = salida + "seis";
                    case 7-> salida = salida + "siete";
                    case 8-> salida = salida + "ocho";
                    case 9-> salida = salida + "nueve";
                }
        }
    }
        System.out.println("El número escrito es " + salida);
    }
}
