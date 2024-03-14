package Unidad4;

import java.util.Arrays;
import java.util.Scanner;

//Vamos a realizar la cesta de la compra
//Cada vez que compramos, variamos de productos y de cantidad
//Crearemos un array que crecera a medida que insertemos productos, para ello utilizaremos un pequeño menu
//de busqueda y de insercion.
//para ello utilizaremos un pequeño menu, y para la ejecucion funciones de buqueda y de insercion
public class InsertarOrdenadaFunciones {
    static Scanner sc = new Scanner(System.in);
    static String cesta[] = new String[0];
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        mostrar("································");
        mostrar("······ CESTA DE LA COMPRA ······");
        mostrar("1. Insertar");
        mostrar("2. Mostrar Cesta");
        mostrar("3. Eliminar Producto");
        mostrar("4. Imprimir y salir");
        mostrar("································");
        mostrarSinLn("Indique su opcion ->");
        int opcion = sc.nextInt();


        switch (opcion){
            case 1 -> {
                cesta = insertar(cesta);
                menu();
            }
            case 2 -> {
                mostrar(Arrays.toString(cesta));
                menu();
            }
            case 3 -> {
                cesta = borrar(cesta);
                menu();
            }
            case 4 -> {

            }
        }

    }

    public static String[] insertar(String cesta[]) {
        //pregunto el producto a insertar
        mostrarSinLn("Indica el nombre del producto -> ");
        String productoNuevo = sc.next();sc.nextLine();
        //Lo buscamos, si esta, lo insertamos
        boolean existe = buscarProducto(cesta, productoNuevo);

        if(existe){
            mostrar("El producto que indica ya existe");
        } else {//Lo insertas
            cesta = Arrays.copyOf(cesta, cesta.length+1);
            cesta[cesta.length-1] = productoNuevo;
        }
        //lo devolvemos a la funcion menu
        return cesta;
    }

    public static boolean buscarProducto(String cesta[], String productoNuevo){
        boolean existe = false; //Creamos un booleano que controle si existe el producto
        int indice = 0;
        while(indice < cesta.length && !cesta[indice].equals(productoNuevo)){
            indice++;
        }
        if (indice < cesta.length){
           existe = true;
        }

        return existe;
    }


    /************************FUNCION ELIMINAR ARTICULO********************************/

    public static String[] borrar(String cesta[]){
        int indice = 0;
        mostrarSinLn("Indica el nombre del producto a eliminar: ");
        String productoElimin = sc.next();sc.nextLine();
        for (int i = 0; i < cesta.length; i++) {
            if (cesta[i].equals(productoElimin)){
                indice = i;
            }
        }
        boolean existe = buscarProducto(cesta,productoElimin);

        if (!existe){
            mostrar("El producto que quieres eliminar no existe");
        }else {
            cesta[indice] = cesta[cesta.length-1];
            cesta = Arrays.copyOf(cesta,cesta.length-1);
        }

        return cesta;
    }

    public static void mostrar(String texto){
         System.out.println(texto);
    }

    public static void mostrarSinLn(String texto){
         System.out.print(texto);
    }
}
