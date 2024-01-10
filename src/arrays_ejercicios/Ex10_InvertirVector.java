/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_ejercicios;
import java.util.Scanner;
/**
 *
 * @author newge
 */
public class Ex10_InvertirVector {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int vector[] = new int [10];
        System.out.println("Introduce 10 numeros enteros:");
        
        for(int i=0;i<vector.length;i++){          
            
            System.out.println("Introduce el entero: "+(i+1));
             vector[i] = sc.nextInt();
        }
        System.out.println("Tu vector es: ");
        for(int i=0;i<vector.length;i++){  
            
            if(i<vector.length-1){
             System.out.print(vector[i]+", ");
            }else{
                System.out.println(vector[i]+".");
            }
        }
        System.out.println("Tu vector INVERTIDO es: ");
        for(int i=vector.length-1;i>=0;i--){  
            
            if(i==0){
             System.out.print(vector[i]+".");
            }else{
                System.out.print(vector[i]+", ");
            }
        }
    }
}
