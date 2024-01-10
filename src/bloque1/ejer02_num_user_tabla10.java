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
public class ejer02_num_user_tabla10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hola, introduce un numero ->");
        
        int num = sc.nextInt();
        
        for(int i = 0; i<=10;i++ ){
            
            int resultado = i * num;
            
            System.out.println(resultado);
        }  
    }
}
