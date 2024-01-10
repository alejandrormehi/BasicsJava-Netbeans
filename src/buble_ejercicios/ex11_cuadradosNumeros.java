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
public class ex11_cuadradosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hola! Introduce un número a analizar");
        
        int num = sc.nextInt();
        int resultado = 0;
        if(num>0){
            
            for(int i=0 ; i<=num ; i++){
                resultado=i*i;
                
                System.out.println("El resultado de "+i +" es "+ resultado);
            }
            
        }else{
            System.out.println("Introduce un número válido");
        }
    }
}
