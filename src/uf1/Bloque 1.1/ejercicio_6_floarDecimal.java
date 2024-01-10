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
public class ejercicio_6_floarDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        
        float resultado = num1/num2;
        System.out.printf("%.2f%n",resultado);
      
    }
}
