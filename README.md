<h1>
  PROYECTO DE UNA MAQUINA EXPENDEDORA DE GOLOSINAS EN JAVA CON ARRAYS
</h1>

Nos piden que implementemos el software para una máquina expendedora de golosinas.
 
También tendrán una cantidad inicial, que en principio será de 5.
Tendremos un pequeño menú con las siguientes opciones:

Pedir golosina: pedirá la posición de la golosina que quiera. Esta máquina tiene golosinas en cada posición, identificados por su fila y columna, que será lo que introduzca el usuario al pedir una golosina, por ejemplo si el usuario teclea 20 significa que está pidiendo la golosina que está en la fila 2 columna 0. Cuando no haya más golosinas se le indicará al usuario. Solo puede pedir una golosina y supondremos que el usuario siempre tiene dinero al elegir. Recuerda de disminuir la cantidad la pedir.

Mostrar golosinas: mostrara todas las golosinas disponibles. Mostrará el código que debe introducir el usuario, el nombre y el precio. La cantidad no se mostrará.

Rellenar golosinas: esta es una función exclusiva de un técnico por lo que nos pedirá una contraseña, si el usuario escribe “MaquinaExpendedora2017” le pedirá la posición de la golosina y la cantidad.

Apagar maquina: sale del programa, antes de salir mostrara las ventas totales durante la ejecución del programa.

El programa debe ser modularizado, es decir, todas las funciones que veas que sean necesarias debes crearlas, así como todas aquellas acciones que veas que se repitan. Piensa que funciones pueden ser.

Las funciones deben ser lo más genéricas posibles.

Package Unidad4
Class MaquinaExpendedora
java.lang.Object
Unidad4.MaquinaExpendedora
public class MaquinaExpendedora
extends Object
Version:
1.0 14/03/2024
Constructor Summary Link icon
Constructors
Constructor
Description
MaquinaExpendedora()
 
Method Summary Link icon
All MethodsStatic MethodsConcrete Methods
Modifier and Type
Method
Description
static boolean
controlStock(int[][] stock, int fila, int columna)
Método que controla que el stock mediante booleanos
static void
main(String[] args)
 
static void
menu()
Muestra el menú de la aplicación
static void
mostrar(String texto)
Método que se usa para mostrar en sonsola los textos con salto de línea
static void
mostrarGolosinas(String[][] golosinas, double[][] precios)
Métodos para mostrar las posociones, los nombres de las golosinas y su precio
static void
mostrarSinLn(String texto)
Método que se usa para mostrar en consola los textos sin salto de línea
static int[][]
rellenarMaquina(int[][] stock, int valor)
Método que se utiliza para rellenar el stock de la máquina al inicio y cuando va el técnico a reponer el stock
Methods inherited from class java.lang.Object Link icon
clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait
Constructor Details Link icon
MaquinaExpendedora Link icon
public MaquinaExpendedora()
Method Details Link icon
main Link icon
public static void main(String[] args)
                 throws InterruptedException
Throws:
InterruptedException
menu Link icon
public static void menu()
                 throws InterruptedException
Muestra el menú de la aplicación
Throws:
InterruptedException
mostrarGolosinas Link icon
public static void mostrarGolosinas(String[][] golosinas,
 double[][] precios)
Métodos para mostrar las posociones, los nombres de las golosinas y su precio
Parameters:
golosinas -
precios -
rellenarMaquina Link icon
public static int[][] rellenarMaquina(int[][] stock,
 int valor)
Método que se utiliza para rellenar el stock de la máquina al inicio y cuando va el técnico a reponer el stock
Parameters:
valor -
Returns:
stock
controlStock Link icon
public static boolean controlStock(int[][] stock,
 int fila,
 int columna)
Método que controla que el stock mediante booleanos
Parameters:
stock -
fila -
columna -
Returns:
mostrar Link icon
public static void mostrar(String texto)
Método que se usa para mostrar en sonsola los textos con salto de línea
Parameters:
texto -
mostrarSinLn Link icon
public static void mostrarSinLn(String texto)
Método que se usa para mostrar en consola los textos sin salto de línea
Parameters:
texto -
