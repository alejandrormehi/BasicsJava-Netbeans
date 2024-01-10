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
public class ex13_maximoDeSecuencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Manda un número: " );
        
        int maximo = Integer.MIN_VALUE;
    
        int veces = 0;
        for(int i=0; i<10;i++){
            int num = sc.nextInt();
            
            if (num>maximo) {
                maximo=num;
                veces=1;
                
            }else if (num==maximo) {
                
                veces++;
            }
            
            
        }
        System.out.println("El valor maximo es "+ maximo);
        System.out.println("El numero de veces que ha aparecido es: " + veces);
    }
}
