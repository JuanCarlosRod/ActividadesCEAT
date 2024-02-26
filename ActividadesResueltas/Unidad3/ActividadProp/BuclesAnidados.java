package Unidad3.ActividadProp;

import java.util.Scanner;

public class BuclesAnidados {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++){
            System.out.println("\nTABLA DEL " + i);

            for (int y = 1; y <=10; y++){
                System.out.println(y+"x"+i+"= " + i*y);
            }
        }
    }
}
