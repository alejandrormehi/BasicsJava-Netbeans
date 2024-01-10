/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debugging;

/**
 *
 * @author newge
 */
public class Debug4 {
 public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Imprimiendo la diagonal de la matriz:");

        // Bucle 1: Imprimir la diagonal de la matriz
        for (int i = 0; i <= matriz.length; i++) { 
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println("\nSumando todos los elementos de la matriz:");

        int suma = 0;

        // Bucle 2: Sumar todos los elementos de la matriz
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) { 
                suma += matriz[fila][columna];
            }
        }

        System.out.println("La suma de todos los elementos es: " + suma);
    }
}