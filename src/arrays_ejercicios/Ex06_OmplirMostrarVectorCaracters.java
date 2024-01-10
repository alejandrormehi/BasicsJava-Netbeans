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
public class Ex06_OmplirMostrarVectorCaracters {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char vector [] = new char [10];
   
        String abc = "abcdefghijklm";
        
        for(int i=0;i<vector.length;i++){
            vector[i] = abc.charAt(i);
        }
        for(int i=0 ; i<vector.length;i++){
            System.out.println("El valor de la posicion " + i + " es: "+vector[i]);
        }
    }
}
