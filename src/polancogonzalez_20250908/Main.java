/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polancogonzalez_20250908;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class Main {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here


        // TAMAÑO DEL ARREGLO
        int cantidad_elementos = 5;

        // CREACIÓN E INSTANCIA ARREGLO DE NÚMEROS DESORDENADOS
        int[] numeros_desordenados = new int[cantidad_elementos];

        // CREACIÓN E INSTANCIA DEL OBJETO SCANNER
        Scanner scanner = new Scanner(System.in);

        // NOTIFICACIÓN AL USUARIO
        System.out.println("Por favor ingrese " + cantidad_elementos + " números enteros de manera desordenada:");

        // INGRESO DE DATOS POR TECLADO
        for (int i = 0; i < numeros_desordenados.length; i++) {
            System.out.print("Digite el elemento " + (i + 1) + ": ");
            numeros_desordenados[i] = scanner.nextInt();
        }

        // MOSTRAR LOS NÚMEROS DIGITADOS
        System.out.println("\nUsted digitó los siguientes números:");
        for (int num : numeros_desordenados) {
            System.out.print(num + " ");
        }
        System.out.println();

        // ORDENAR EL ARREGLO
        int[] numeros_ordenados = ordenar(numeros_desordenados);

        // MOSTRAR LOS NÚMEROS ORDENADOS
        System.out.println("\nLos números ordenados son:");
        for (int num : numeros_ordenados) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close(); // 🔹 Buena práctica cerrar el scanner
    }

    // FUNCIÓN PARA ORDENAR UN ARREGLO UNIDIMENSIONAL (Método burbuja)
    public static int[] ordenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int mayor = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = mayor;
                }
            }
        }
        return arreglo;
    }
}
