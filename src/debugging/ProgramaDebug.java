/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debugging;

/**
 *
 * @author newge
 */
public class ProgramaDebug {
    public static void main(String[] args) {
        
  
     int[] numeros = {1, 2, 3, 4, 5};
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) { // Error: El índice debería ser i < numeros.length en lugar de i <= numeros.length
            suma += numeros[i];
        }

        System.out.println("La suma de los números es: " + suma);

        String texto = "Mi mama me mima4";
        System.out.println("El texto secreto es: "+texto);
        int longitud = texto.length(); // Error: Intentando obtener la longitud de un objeto null
        System.out.println("La longitud del texto es: " + longitud);

        int dividendo = 10;
        int divisor = 2;
        int resultado = dividendo / divisor; // Error: División entre cero
        System.out.println("El resultado de la división es: " + resultado);
    }
}