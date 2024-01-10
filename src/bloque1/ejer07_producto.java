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
public class ejer07_producto {
    
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Hola, introduce un numero ->");
        
        int num = sc.nextInt();
        
        System.out.println("Ahora introduce otro numero -> ");
        int num2 = sc.nextInt();
        
        int resultado = num*num2;
        
        System.out.println("El producto es: " + resultado);
}
}