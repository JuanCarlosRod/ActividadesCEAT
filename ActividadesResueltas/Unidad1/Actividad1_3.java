package Unidad1;
import java.time.LocalDate;
import java.util.Scanner;

public class Actividad1_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LocalDate fechaHoy = LocalDate.now();

        System.out.print("Introduce tu edad -> ");

        int edadUsusario = sc.nextInt();

        int edadCalculada = edadUsusario + 1;

        System.out.print("Tu edad el próximo año será: " + edadCalculada);

    }
}
