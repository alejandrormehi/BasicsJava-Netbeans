/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author newge
 */
public class ejercicio_5_divFraccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        double resultado = (double)num1 / num2; // De esta manera hemos convertido el primer valor "num1" en un double
        System.out.println(resultado);
    }
}
