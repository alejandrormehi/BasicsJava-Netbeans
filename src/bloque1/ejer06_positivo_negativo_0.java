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
public class ejer06_positivo_negativo_0 {
    public static void main(String[] args) {
        

    Scanner sc = new Scanner(System.in);
        
        System.out.println("Hola, introduce un numero ->");
        
        int num = sc.nextInt();
        
        if(num>0){
            System.out.println("Es positivo");
        }else if(num<0){
            System.out.println("Es negativo");
        }else{
            System.out.println("ES ZERO");
        }
}
}