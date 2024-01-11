package Unidad_1;

import java.util.Scanner;

public class Actividad1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double PRECIO_MANZAN = 2.35;
        final double PRECIO_PERA = 1.95;

        double kilosManz1Sem, kilosPer1Sem,kilosManz2Sem, kilosPer2Sem, ingreManz, ingrePer;

        System.out.print("¿Cuántos kilos de Manzanas se han vendido en el primer semestre? -> ");
        kilosManz1Sem = sc.nextDouble();

        System.out.print("¿Cuántos kilos de Manzanas se han vendido en el segundo semestre? -> ");
        kilosManz2Sem = sc.nextDouble();

        System.out.print("¿Cuántos kilos de Peras se han vendido en el primer semestre? -> ");
        kilosPer1Sem = sc.nextDouble();

        System.out.print("¿Cuántos kilos de Peras se han vendido en el segundo semestre? -> ");
        kilosPer2Sem = sc.nextDouble();

        ingreManz = (kilosManz1Sem + kilosManz2Sem) * PRECIO_MANZAN;
        ingrePer = (kilosPer1Sem + kilosPer2Sem) * PRECIO_PERA;

        System.out.println("Los ingresos de las Mazanas son de " + ingreManz + "€");
        System.out.println("Los ingresos de las Peras son de " + ingrePer + "€");
    }
}
