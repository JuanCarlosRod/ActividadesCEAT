package Unidad3;

import javax.swing.*;
import javax.swing.ImageIcon;
import java.util.Scanner;

public class Actividad3_5_Panel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operador = "", menu = "", salida = "";
        byte opcion;
        int numRand1, numRand2, respuesta = 0, resupuestaUser = 0, contador = 0;

        do {
            menu = "";
            menu += "___MENU___\n";
            menu += "1- SUMAR\n";
            menu += "2 - RESTAR\n";
            menu += "3 - MULTIPLICAR\n";
            menu += "4 - SALIR\n";

            opcion = (byte) Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            numRand1 = (int) (Math.random()*100+1);
            numRand2 = (int) (Math.random()*100+1);

            switch (opcion){
                case 1 -> {
                    operador = "+";
                    respuesta = numRand1 + numRand2;
                    salida = numRand1 + "" + operador + "" + numRand2;
                }
                case 2 -> {
                    operador = "-";
                    respuesta = numRand1 - numRand2;
                    salida = numRand1 + "" + operador + "" + numRand2;
                }
                case 3 -> {
                    operador = "x";
                    respuesta = numRand1 * numRand2;
                    salida = numRand1 + "" + operador + "" + numRand2;
                }
            }
            if (opcion != 4){
                resupuestaUser = Integer.parseInt(JOptionPane.showInputDialog(salida));
                if (resupuestaUser == respuesta){
                    ImageIcon icono = new ImageIcon("C:\\Users\\Juan Carlos\\IdeaProjects\\ActividadesCEAT\\ActividadesResueltas\\resources\\goodPepe.png");
                    JOptionPane.showMessageDialog(null, "¡¡¡CORRECTO!!!", "CORRECTO", JOptionPane.ERROR_MESSAGE, icono);
                } else {
                    ImageIcon icono = new ImageIcon("C:\\Users\\Juan Carlos\\IdeaProjects\\ActividadesCEAT\\ActividadesResueltas\\resources\\badPepe.png");
                    JOptionPane.showMessageDialog(null, "¡¡¡INCORRECTO!!!", "ERROR", JOptionPane.ERROR_MESSAGE, icono);
                    contador--;
                }
            }
            contador++;

        } while(opcion <= 3 && opcion >= 1);
        --contador;
        if (contador < 0){
            contador = 0;
        }
        ImageIcon icono = new ImageIcon("C:\\Users\\Juan Carlos\\IdeaProjects\\ActividadesCEAT\\ActividadesResueltas\\resources\\mainPepe.png");
        JOptionPane.showMessageDialog(null, "Nº Acertadas: " + contador, "RESULTADOS", JOptionPane.ERROR_MESSAGE, icono);
        }
}
