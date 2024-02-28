package Repaso;

import java.util.Scanner;

public class Comandas {
    /**
     * Enunciado: Crear un programa que permita a traves de un menu (Tortilla, Croquetas, Jamón y Queso, Bebidas)
     * Indicar lo que el cliente solicita, y mostrar el total de su pedido, tomando en cuenta, los precios:
     * Tortilla - 2€
     * Croquetas - 8€
     * Jamon y Queso - 15€
     * Bebidas - 3€
     * */

    public static void main(String[] args) {
        int cantTor = 0, cantJam = 0, cantCroq = 0, cantBeb = 0, cant = 0;
        String detallePedido = "";
        double cuenta = 0, IVA = 21, ivaAplic=0;
        Scanner sc = new Scanner(System.in);
        byte opcion = 0;

        System.out.println("\t************MENU************");
        System.out.println("\t* 1. Tortilla      - 2€    *");
        System.out.println("\t* 2. Croquetas     - 8€    *");
        System.out.println("\t* 3. Jamón y Queso - 15€   *");
        System.out.println("\t* 4. Bebida        - 3€    *");
        System.out.println("\t* 5. Cuenta y Pagar        *");
        System.out.println("\t****************************");

        do {
            System.out.println("Introduce tu pedido -> ");
            opcion = sc.nextByte();


            if (opcion != 5){
                System.out.println("Introuce la cantidad: ");
                cant = sc.nextInt();
            }

            switch (opcion){
                case  1 -> {
                    cantTor = cant;
                    cuenta += cantTor*2;
                    detallePedido += "Tortilla " +"x"+ cantTor+ "\n";
                }
                case 2 -> {
                    cantCroq = cant;

                    cuenta += cantCroq*8;
                    detallePedido += "Croqueta " +"x"+ cantCroq+ "\n";
                }
                case 3 -> {
                    cantJam = cant;

                    cuenta += cantJam*15;
                    detallePedido += "Jamon " +"x"+ cantJam+ "\n";
                }
                case 4 -> {
                    cantBeb = cant;

                    cuenta += cantBeb*3;
                    detallePedido += "Bebida " +"x"+ cantBeb+ "\n";
                }
                case 5 -> {
                    break;
                }
                default -> {
                    System.out.println("Opcion no válida");
                }

            }

        }while (opcion != 5);

        ivaAplic = (cuenta *0.21);
        cuenta = cuenta + ivaAplic;

        System.out.println("******FACTURA********");
        System.out.println("Pedido: " + "\n" + detallePedido);
        System.out.println("Porcentaje de IVA: " + ivaAplic);
        System.out.println("Importe a pagar: " + cuenta + "€");

    }
}
