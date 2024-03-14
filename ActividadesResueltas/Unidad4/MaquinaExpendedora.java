package Unidad4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @Description Aplicación para una máquina exprendedora de golosinas. Tema:Array
 * @author Tania Pinero y JC
 * @version 1.0 14/03/2024
 * **/
public class MaquinaExpendedora {
    public static void main(String[] args) throws InterruptedException {
        menu();
    }

    /**
     * Muestra el menú de la aplicación
     */
    public static void menu() throws InterruptedException {
        //Hacemos el array de las golosinas
        String[][] golosinas={
                {
                        "KitKat","Chicles de fresa","Lacasitos","Palotes"
                },
                {
                        "Kinder Bueno","Bolsa Haribo","Chettos","Twix"
                },
                {
                        "Galletas OREO","M&M's","Patatas Fritas","Chicles de menta"
                },
                {
                        "Mylkybar","KitKat Blanco","Galletas Oreo Fresa", "Huesitos"
                }
        };

        //Array de precios
        double[][] precios={
                {
                        1.5,1.0,1.65,1.10
                },
                {
                        2.0,2.20,1.0,1.05
                },
                {
                        1.25,2.0,2.50,1.0
                },
                {
                        3.0,1.50,1.25,1.5
                }
        };

        //Array Stock
        int stock[][]=new int[4][4];
        //LLalamos a la función de rellenar la máquina
        stock=rellenarMaquina(stock,5);

        boolean salir=false; //Para validar el bucle del menu
        double totalVentasEuros=0;
        int opcion,posicion, posicionFila, posicionColumna, cantidadStock;

        //Desarrollamos el menú
        while (!salir){ //!variable boolena indica que es falso -> Mientras sea falso se repite el bucle
            //Opciones
            Scanner sc=new Scanner (System.in);

            mostrar("***** M A Q U I NA *****");
            mostrar("1. Pedir Gosolinas");
            mostrar("2. Mostrar Golosinas");
            mostrar("3. Rellenar Stock (Admin)");
            mostrar("4. Apagar la máquina");
            mostrarSinLn("Elige tu opción -> ");
            opcion=sc.nextInt();

            //Hacemos un switch case de opciones
            switch (opcion){
                case 1 -> {
                    //Pedir las golosinas
                    mostrarSinLn("Indique la posición de la golosina a comprar -> ");
                    posicion=sc.nextInt();

                    //Tenemos que validar que la posición sea >=0 && <=33
                    if (posicion>=0 && posicion<= 3 || posicion>10 && posicion <=13 || posicion>= 20 && posicion<= 23 || posicion>= 30 && posicion<=33){
                        //Calculamos el valor de la fila
                        posicionFila=(posicion%100)/10;
                        posicionColumna=(posicion%10);

                        //Vamos a llamar a un método para que controle el stock y me diga true o false si hay cantidad
                        //suficiente a vender
                        if (controlStock(stock,posicionFila,posicionColumna)){
                            mostrarSinLn("Ingresa " + precios[posicionFila][posicionColumna] + "€ -> ");
                            double aux=sc.nextDouble();

                            double cambio = aux - precios[posicionFila][posicionColumna];
                            mostrar("El cambio es de " + cambio + "€");
                            mostrar("Disfruta de tus ....." + golosinas[posicionFila][posicionColumna]);

                            stock[posicionFila][posicionColumna]--;
                            totalVentasEuros+=precios[posicionFila][posicionColumna];
                        }else {
                            mostrar("No hay " + golosinas[posicionFila][posicionColumna] + " en la máquina");
                        }

                    }else{
                        mostrar("Opción no admitida");
                    }
                }
                case 2 -> {
                    //Mostrar todos los códigos, las golosinas y su precio
                    mostrarGolosinas(golosinas,precios);
                }
                case 3 -> {
                    //Solicitará la contraseña del técnico y luego llamar a la función de rellenar
                    mostrarSinLn("Ingrese la Contraseña autorizada -> ");
                    String pass=sc.next(); sc.nextLine();

                    if (pass.equals("chuch3s")){ //equals es para comparar un String
                        mostrar("······ Reponiendo la máquina ······");


                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                mostrarSinLn("🍭");
                                //TimeUnit.SECONDS.sleep(1);
                                Thread.sleep(500);
                            }
                            mostrar("");
                        }
                        rellenarMaquina(stock,5);
                    }else {
                        mostrar("Usuario no autorizado");
                    }

                }
                case 4 -> {
                    //Mostrar lo recolectado en las ventas de la máquina (cierre de caja)
                    mostrar("La máquina ha vendido -> " + totalVentasEuros + "€");
                    salir=true;
                }
                default -> mostrar("Opción no válida");
            }
        }
    }

    /**
     * Métodos para mostrar las posociones, los nombres de las golosinas y su precio
     * @param  golosinas
     * @param precios**/
    public static void mostrarGolosinas (String golosinas[][], double precios [][]){
        //Necesitamos recorrer el array de nombres y con la posición obtenemos el precio
        for (int i = 0; i < golosinas.length; i++) {
            for (int j = 0; j < golosinas[i].length; j++) {
                mostrar(i + "" + j + " " + golosinas[i][j] + " " + precios[i][j] + "€");
            }
        }
    }

    /**
     * Método que se utiliza para rellenar el stock de la máquina al inicio y cuando va el técnico
     * a reponer el stock
     * @param valor
     * @return stock**/
    public static int[][] rellenarMaquina (int stock[][], int valor){
        //Inicializamos el array de stock de cada golosina en 5
        for (int i = 0; i < stock.length; i++) {//Esto es para recorrer toda la fila
            for (int j = 0; j < stock[i].length; j++) {  //Esto es para que pueda bajar a la siguiente fila
                stock[i][j]=valor; // Valor que se envía como parámetro
            }
        }
//        System.out.println(Arrays.deepToString(stock)); //deep se usa cuando tienes que mostrar más de 1 dimensión. Esto era solo de ejemplo
        return stock;
    }

    /**
     * Método  que controla que el stock mediante booleanos
     * @param stock
     * @param fila
     * @param columna
     * @return **/
    public static boolean controlStock(int stock[][], int fila, int columna){
        if (stock[fila][columna]==0){
            return false;
        }else {
            return true;
        }
    }



    /***Método que se usa para mostrar en sonsola los textos con salto de línea
     * @param texto
     * */
    public static void mostrar (String texto){ System.out.println("\t"+texto);}

    /**Método que se usa para mostrar en consola los textos sin salto de línea
     * @param texto
     * **/
    public static void mostrarSinLn (String texto){System.out.print("\t"+texto);}
}