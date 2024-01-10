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
public class ejer05_par_o_impar {
    public static void main(String[] args) {
        

    Scanner sc = new Scanner(System.in);
        
        System.out.println("Hola, introduce un numero ->");
        
        int num = sc.nextInt();
        
        int resultado = num%2;
        if (resultado>0) {
            System.out.println("El numero "+num+" ES IMPAR");
        }else{
            System.out.println("El numero "+num+ " ES PAR");
        }
       
}
    }