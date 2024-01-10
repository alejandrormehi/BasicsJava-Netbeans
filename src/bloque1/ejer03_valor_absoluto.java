/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloque1;

import java.util.Scanner;

/**
 *
 * @author newge
 */
public class ejer03_valor_absoluto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hola, introduce un numero ->");
        
        int num = sc.nextInt();
        
        int resultado = Math.abs(num);
        
        System.out.println("El valor absoluto del numero es: " + resultado);

        
    }
}
