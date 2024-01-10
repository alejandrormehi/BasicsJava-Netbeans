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
public class ex15_programaN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido al programa N");
        System.out.println("Escribe un numero");
        
        int cuadrado=0;
        int cubo =0;
        
        int n = sc.nextInt();
        
        
        for(int i=1; i<=n; i++){
            
            cubo = (i*i)*i;
            cuadrado = i*i;
            
            
            System.out.println(i + " su cuadrado es "+ cuadrado);
            
            System.out.println(i + " su cubo es "+ cubo);

            System.out.println();
        }
        
    }
}
