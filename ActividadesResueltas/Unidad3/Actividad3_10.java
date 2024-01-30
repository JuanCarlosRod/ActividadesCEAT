package Unidad3;

public class Actividad3_10 {
    public static void main(String[] args) {
        double suma = 0;
        for (int i = 1; i <= 10; i++){
            int impar = 2 * i -1;
            System.out.println(impar);
            suma += impar;
        }
        System.out.println("La suma de los 10 primeros numeros impares es: " + suma);
    }
}
