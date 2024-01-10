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
public class Ex04_OmplirMostrarVector {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int vector [] = new int [10];
        
        for(int i=0; i<vector.length;i++){
            vector[i]=i+100;
        }
        for(int i=0; i<vector.length;i++){
            System.out.println("El valor de la posicion "+i+" es: "+ vector[i]);
        }
    }
}
