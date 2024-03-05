import java.util.Arrays;
import java.util.Scanner;


public class BusquedaOrdenada {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int numeros[] = {13,11,15,18,12,10,14,17};
        mostrar("Longitud -> " + numeros.length);
        mostrar(Arrays.toString(numeros));
        Arrays.sort(numeros);
        mostrar("Ordenado: " + Arrays.toString(numeros));

        mostrar("Inserta numero a buscar: ");
        int numB = sc.nextInt();
        int pos = Arrays.binarySearch(numeros, numB);

        mostrar("Posicion -> " + pos);

        if (pos < 0){
            int indiceInsertar = -pos-1;
            mostrar( "El "+ numB + " deberia ir en el indice " + indiceInsertar+ " para mantener la tabla ordenada");
        }
    }

    public static void mostrar(String texto){
        System.out.println(texto);
    }

    public static void mostrarSinLn(String texto){
        System.out.print(texto);
    }
}
