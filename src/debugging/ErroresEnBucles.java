/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debugging;

/**
 *
 * @author newge
 */
public class ErroresEnBucles {
    
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Recorriendo el arreglo para encontrar el número 3:");

        
        for (int i = 0; i <= numeros.length; i++){
            if (numeros[i] == 3) {
                System.out.println("¡Número 3 encontrado en la posición " + i + "!");
                break;
            }
        }

        System.out.println("Intentando imprimir los números del 1 al 5:");

        // Bucle 2: Imprimiendo los números del 1 al 5
        for (int i = 1; i <= 5; i++) { 
            System.out.print(i + " ");
        }
    }
}