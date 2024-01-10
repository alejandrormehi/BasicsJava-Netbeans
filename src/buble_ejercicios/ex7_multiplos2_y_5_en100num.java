/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buble_ejercicios;
import java.util.Scanner;

/**
 *
 * @author newge
 */
public class ex7_multiplos2_y_5_en100num {
    public static void main(String[] args) {
        
        int multiplos2 =0;
        int multiplos5 =0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                multiplos2++;
            } if (i%5==0) {
                multiplos5++;
            }
            
        }
        System.out.println("Hay: "+multiplos2+ " multiplos de 2 en la lista");
            System.out.println("Hay: "+multiplos5+ " multiplos de 5 en la lista");
    }
}
