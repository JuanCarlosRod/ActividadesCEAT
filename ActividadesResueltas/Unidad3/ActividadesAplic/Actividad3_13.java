package Unidad3.ActividadesAplic;


import java.util.Scanner;

public class Actividad3_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora = 0, minuto, segundo;

        do {
            System.out.print("Introduzca las horas -> ");
            hora = sc.nextInt();

        }while (!(hora >=0 && hora <= 23) );

        do {
            System.out.print("Introduzca los minutos -> ");
            minuto = sc.nextInt();
        }while (!(minuto >=0 && minuto <= 59));

        do {
            System.out.print("Introduzca los segundos -> ");
            segundo = sc.nextInt();
        }while (!(segundo >=0 && segundo <= 59));

        System.out.println("Introduzca los segundos que quiere incrementar -> ");
        int incremento = sc.nextInt();

        for (int i = 1; i <= incremento; i++){
            segundo++;

            if (segundo > 59) {
                segundo = 0;
                minuto++;

                if (minuto > 59) {
                    minuto = 0;
                    hora++;

                    if (hora > 23) {
                        hora = 0;
                    }
                }
            }
        }

        System.out.println(hora+" horas"+minuto+" minutos"+segundo + " segundos");



    }
}
