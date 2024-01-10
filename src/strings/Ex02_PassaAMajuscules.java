/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;
import java.util.Scanner;

/**
 *
 * @author newge
 */
public class Ex02_PassaAMajuscules {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase EN MINUSCULAS");

        String frase = sc.nextLine();
        
        System.out.println("La frase en mayusculas es: " +frase.toUpperCase());

    }
}
