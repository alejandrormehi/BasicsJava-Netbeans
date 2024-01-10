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
public class ex9_numerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
         System.out.println("Hola! Introduce un numero a analizar");
        
        int num = sc.nextInt();
        boolean primo = true;
        
        
        if(num<=1){
            
            primo=false;
            
        }else{
            for(int i=2; i<num; i++){
                if(num%i==0){
                    primo=false;
                    break;
                }
            }
        }
            if (primo==true) {
                System.out.println("El numero SI es primo");
            }else{
                System.out.println("El numero NO es primo");
            }
            
        }    
    }

