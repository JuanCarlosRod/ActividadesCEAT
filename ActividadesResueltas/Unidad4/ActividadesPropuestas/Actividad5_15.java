package Unidad4.ActividadesPropuestas;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_15 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        altaNotas();
    }

    //Metodo para insertar notas
    public static int[][] altaNotas(){
        int notas[][] = new int[3][5];
        //Solicitamos los Trimestres
        for (int trimestre=0; trimestre<3;trimestre++){
            mostrarSinLn("Notas del trimestre " + (trimestre+1)+" ");
            leerNotas(notas,trimestre);
        }
        double media[] = new double[3];
        for (int alumn = 0; alumn < 5; alumn++) {
            for (int trim = 0; trim < 3; trim++) {
                media[trim] += notas[trim][alumn];
            }
        }
        mostrar("La media del Primer Trimestre = " + media[0]/5);
        mostrar("La media del Segundo Trimestre = " + media[1]/5);
        mostrar("La media del Tercer Trimestre = " + media[2]/5);

        alumnSelecc(notas);

        return notas;
    }

    public static void leerNotas(int notas[][], int trimestre){
        for (int i = 0; i < notas[trimestre].length; i++) {
            mostrar("Alumno("+(i+1)+")-> ");
            notas[trimestre][i] =sc.nextInt();
        }
        mostrar(Arrays.deepToString(notas));
    }

    public static void alumnSelecc(int notas[][]){
        int pos = 0;
        mostrar("Indica el Nº de alumno que quieras sacar (1 al 5) -> ");
        pos = sc.nextInt()-1;

        double mediaAlum[] = new double[3];

        for (int trim = 0; trim < 3; trim++) {
            mediaAlum[trim] += notas[trim][pos];
        }

        mostrar("Notas de alumno " + (pos+1) +" -> " + Arrays.toString(mediaAlum));
        double notaMedia = (mediaAlum[0] + mediaAlum[1] + mediaAlum[2]) / 3;
        mostrar("Su nota media final es de: " + notaMedia);
    }

    public static void mostrar(String texto){ System.out.println(texto);}

    public static void mostrarSinLn(String texto){ System.out.print(texto);}
}
