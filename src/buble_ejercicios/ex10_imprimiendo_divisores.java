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
public class ex10_imprimiendo_divisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hola! Introduce un número a analizar");
        
        int num = sc.nextInt();
        
        if(num>0){
            
            for(int i=1; i<=num;i++){
                
                if(num%i==0){
                    System.out.println(i);
            }
            
            } 
        }else{
            System.out.println("Introduce un número valido");
        }
    }
}
