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
public class ejer04_raiz_cuadrada {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Hola, introduce un numero ->");
        
        int num = sc.nextInt();
        
        double resultado = Math.sqrt(num);
        
        System.out.println("La raiz cuadrada del numero es : " + resultado);
        
    }
}
