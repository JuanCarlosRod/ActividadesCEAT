package Unidad4.ActividadesPropuestas;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_16 {
static int puntos = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int continuar = 0;
        do {
            mostrar("¿Iniciar Partida? (1. Si / 2. No)");
            continuar = sc.nextInt();

            if (continuar == 1){
                partida();
            }
        }while (continuar == 1);

    }

    public static void partida(){
        int x = 0, y = 0;
        boolean mapa[][] = {
                {true,false,true,true,false},
                {true,false,false,false,true},
                {false,true,true,false,false},
                {true,false,true,true,false},
                {false,true,false,false,false}
        };
        mostrar("_________________________________________________________");
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mostrarSinLn("Y=" + i + " | X=" + j);
            }
            mostrar("");
            mostrar("");
        }
        mostrar("__________________________________________________________");

        do {
            mostrar("Indique la posicion X de la tabla: ");
            x = sc.nextInt();

            mostrar("Indique la posicion Y de la tabla: ");
            y = sc.nextInt();

        }while (y > 4 || y < 0 || x> 4 || x<0);

        int contador = 0;
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                contador++;
                if (i == y && j == x){
                    mostrar("El resultado es: " + mapa[i][j]);
                    mostrar("Ha recorrido " + contador + " casillas...");

                    if (mapa[i][j]){
                        puntos++;
                    }
                    mostrar("Puntos -> " + puntos);
                }

            }
        }

    }

    public static void mostrar(String texto){ System.out.println("\t"+texto);}

    public static void mostrarSinLn(String texto){ System.out.print("\t"+texto);}
}
