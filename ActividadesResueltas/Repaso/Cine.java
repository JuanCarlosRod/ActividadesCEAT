package Repaso;

import java.util.Scanner;

/**
 * Película:
 *  - Mayores -> 6€
 *  - Menores -> 4,5€
 *
 *  - Miércoles -> 4,5€
 *
 *  Cartelera -> Película -> +18 o todos los públicos
 *
 *   - Carnet joven/senior -> 4,5€
 *
 *   Ferrari (TP)       Pobres criaturas >=18           Priscila (TP)
 *   La piscina >=18    Pepa Pig (TP)                   Cazadores de demonios >=18**/
public class Cine {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        double precioMenores=4.5, precioAdultos=6, totalEntradas=0 ;
        byte opcion, miercoles=0;
        int numMenores=0, numAdultos=0, totalMenores=0, totalAdultos=0;

        System.out.println(" *** CARTELERA ***");
        System.out.println("1. Ferrari (TP)");
        System.out.println("2. Pepa Pig (TP)");
        System.out.println("3. Priscila (TP)");
        System.out.println("4. La piscina (+18)");
        System.out.println("5. Pobres criaturas (+18)");
        System.out.println("6. Cazadores de demonios (+18)");
        System.out.println("7. SALIR");
        System.out.println("\n****************************");

        do {
            if ((miercoles!=1 || miercoles!=2) && miercoles!=0){
                System.err.println("Opción no válida");
            }

            System.out.println("\n¿Es miércoles?");
            System.out.println("\t1. Si  \n\t2. No");
            System.out.print("Seleccione una opción -> ");
            miercoles = sc.nextByte();

        }while (miercoles<1 || miercoles>2);

        if (miercoles==1){
            precioAdultos=4.5;
        }

        do {
            System.out.print("Seleccione película -> ");
            opcion=sc.nextByte();

            switch (opcion){
                case 1,2,3 -> {
                    System.out.println("¿Cuántos niños?");
                    numMenores=sc.nextInt();

                    totalEntradas=totalEntradas+(numMenores*precioMenores);
//                totalEntradas+=numMenores*precioMenores;
                    totalMenores=totalMenores+numMenores;


                    System.out.println("¿Cuántos adultos?");
                    numAdultos=sc.nextInt();

                    totalEntradas=totalEntradas+(numAdultos*precioAdultos);
//                totalEntradas+=numMenores*precioAdultos;
                    totalAdultos=totalAdultos+numAdultos;

                }
                case 4,5,6 -> {
                    System.out.println("¿Cuántos adultos?");
                    numAdultos=sc.nextInt();

                    totalEntradas=totalEntradas+(numAdultos*precioAdultos);
                    totalAdultos=totalAdultos+numAdultos;
                }
                case 7 -> System.out.println("Imprimiento ticket...");
                default -> System.err.println("Opción no válida");
            }

        }while (opcion!=7);

        System.out.println("*** TICKET ***");
        if (numMenores!=0){
            System.out.println("Total niños -> " + totalMenores);
        }
        System.out.println("Total adultos -> " + totalAdultos);
        System.out.println("Precio total -> " + totalEntradas + "€");
    }
}