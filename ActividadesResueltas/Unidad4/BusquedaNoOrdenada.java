package Unidad4;

/*
* Busquedas en Arrays no Ordenados.
* La busqueda se hace por medio de un algoritmo utilizando un bucle para encontrar el primer
* elemento encontrado dentro del array, mostrando su indice.
* */
public class BusquedaNoOrdenada {
    public static void main(String[] args) {
        int[] numeros = {5,3,78,2,3,25,65,32};
        mostrar("Longitud de la tabla -> " + numeros.length);

        int indice = 0, numeroBuscado = 32;//Declaramos el indice 0 para que comience desde ese punto el recorrido del bucle
        while(indice < numeros.length && numeros[indice] != numeroBuscado){
            indice++;//Se incrementa el indice para ir recorriendo las posiciones del array
        }
        if (indice == numeros.length){
            mostrar("El numero no se encuentra en la tabla");
        }else {
            mostrar("La posicion del numero es: " + indice);
        }

        String buscar = "Marina";
        String[] nombres = {"Juan", "Tania" , "Marina", "Fran", "Irene", "Ruben", "Andres", "Alba"};
        buscarTexto(nombres, buscar);
    }

    public static void mostrar(String texto){
        System.out.println(texto);
    }

    public static void buscarTexto(String[] texto, String buscar){
        int indice = 0;
        while(indice < texto.length && !texto[indice].equals(buscar)){
            indice++;
        }
        if (indice == texto.length){
            mostrar("El nombre no se encuentra en la tabla");
        }else {
            mostrar("La posicion del nombre es: " + indice);
        }
    }
}
