package Unidad4.ActividadesPropuestas;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_14 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double sueldos[] = insertarSueldos();
        mostrarDecreciente(sueldos);
        mostrarMaxMin(sueldos);
        mediaSueldos(sueldos);
    }

    //Metodo para insertar los sueldos
    public static double[] insertarSueldos(){
        double sueldos[] = new double[0];
        double nuevoSueldo=0;
        do {
            mostrarSinLn("Inserte el sueldo del trabajador: ");
            nuevoSueldo = sc.nextDouble();

            if (nuevoSueldo != -1){
                sueldos  = Arrays.copyOf(sueldos, sueldos.length+1);
                sueldos[sueldos.length-1] = nuevoSueldo;
            }

        } while(nuevoSueldo != -1);

        Arrays.sort(sueldos);

        return sueldos;
    }

    //Metodo para mostrar decreciente

    public static void mostrarDecreciente(double sueldos[]){
        for (int i = sueldos.length-1; i >= 0 ; i--) {
            mostrarSinLn(" " + sueldos[i] + "-");
        }
    }

    //Metodo para indicar max y min sueldos (tabla ordenada)
    public static void mostrarMaxMin(double sueldos[]){
        mostrar("Sueldo mayor -> " + (sueldos[sueldos.length-1]));
        mostrar("Sueldo menor -> " + sueldos[0]);
    }


    //Metodo para calcular la media

    public static void mediaSueldos(double sueldos[]){
        double suma = 0, media = 0;

        for (int i = 0; i < sueldos.length; i++) {
            suma += sueldos[i];
        }

        media = suma/sueldos.length;

        mostrar("La media de los sueldos es de: " + media + "€");
    }

    public static void mostrar(String texto){
         System.out.println(texto);
    }

    public static void mostrarSinLn(String texto){
         System.out.print(texto);
    }
}
