/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author newge
 */
public interface ejercicio_9_hipotenusa {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int cateto1 = sc.nextInt();
        int cateto2 = sc.nextInt();
        
        double hipotenusa = (int)Math.sqrt((cateto1*cateto1)+(cateto2*cateto2));
        
        System.out.println(hipotenusa);
    }
    
}
