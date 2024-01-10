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
public class ejercicio_10_edades {
    public static void main(String[] args) {
        
   
    Scanner sc = new Scanner(System.in);
    
    
    
    System.out.println("Introduce la primerda edad");
    int edad1 = sc.nextInt();
    
    System.out.println("Introduce la segunda edad");
    int edad2 = sc.nextInt();    
    
    int sumaEdades = edad1+edad2;
    System.out.println("La suma de las edad es: " + sumaEdades);
 }
}
