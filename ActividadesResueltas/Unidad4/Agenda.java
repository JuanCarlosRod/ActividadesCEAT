package Unidad4;

import java.util.Scanner;

public class Agenda {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] nombre = new String[3];
        int[] telefono = new int[3];

        for (int i = 0; i < nombre.length; i++) {
            mostrarSinLn("Indique el nombre Nº" + (i+1)+ " ->");
            nombre[i] = sc.next();sc.nextLine();

            mostrarSinLn("Indique el telefono Nº" + (i+1)+ " ->");
            telefono[i] = sc.nextInt();
        }

        mostrar("Lista de telefonos");
        mostrar("Nombre\tTelefono");
        for (int i = 0; i < nombre.length; i++) {
            mostrar(nombre[i] + "\t" + " |"+ telefono[i]+"| ");
            mostrar("································");
        }

        mostrarSinLn("Buscar por nombre -> ");
        String nombreBuscar = sc.next();sc.nextLine();

        int indiceEncotr =buscarNom(nombre, nombreBuscar);
        mostrar("Indice encontrado -> " + nombre[indiceEncotr] +" | "+ telefono[indiceEncotr]);
        //Mostrar los Nombre y numeros insertados

        mostrar("¿Quieres cambiar algun numero telefonico?");
        String resp = sc.nextLine();

        if (resp.equals("No")){
            mostrar("De acuerdo adios....");
        }else {
            mostrarSinLn("Inserte quien -> ");
            nombreBuscar = sc.next();sc.nextLine();
            indiceEncotr = buscarNom(nombre, nombreBuscar);
            if (indiceEncotr < nombre.length){
                mostrarSinLn("Indica el nuevo número-> ");
                telefono[indiceEncotr] = sc.nextInt();
            }

            mostrar("Lista de telefonos");
            mostrar("Nombre\tTelefono");
            for (int i = 0; i < nombre.length; i++) {
                mostrar(nombre[i] + "\t" + " |"+ telefono[i]+"| ");
                mostrar("································");
            }
        }

    }

    public static int buscarNom(String nombre[], String nombreBuscar){
        int indice = 0;
        while(indice < nombre.length && !nombre[indice].equals(nombreBuscar)){
            indice++;
        }
        if (indice == nombre.length){
            mostrar("El numero no se encuentra en la tabla");
        }

        return indice;
    }

    public static void mostrarAgenda(String nombre[], int telefono[]){
        mostrar("Lista de telefonos");
        mostrar("Nombre\tTelefono");
        for (int i = 0; i < nombre.length; i++) {
            mostrar(nombre[i] + "\t" + " |"+ telefono[i]+"| ");
            mostrar("································");
        }
    }

    public static void mostrar(String texto){
        System.out.println(texto);
    }

    public static void mostrarSinLn(String texto){
        System.out.print(texto);
    }
}
