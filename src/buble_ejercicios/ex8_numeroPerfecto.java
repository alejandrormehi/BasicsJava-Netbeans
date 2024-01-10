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
public class ex8_numeroPerfecto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hola! Introduce un numero a analizar");
        
        int num = sc.nextInt();
        int sumanum = 0;
        boolean esperfecto = false;
        
        for(int i=1; i<num;i++){
            
            if(num%i==0){
                sumanum+=i; 
                if(sumanum==num){
                    esperfecto = true;
                }
            }
        }
        if(esperfecto==true){
            System.out.println("El numero SI ES perfecto");
        }else{
            System.out.println("El numero NO ES perfecto");
        }

    }
}
