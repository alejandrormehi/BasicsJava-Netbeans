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
public class ex5_sumaYmultiplicacion_ParesEimpares {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int suma=0;
        int multiplica = 1;
        
        for(int i = 1; i<=20;i++){
            
            if(i%2==0){          
                suma+=i;  
                
            }
            if(i%2!=0){
                multiplica*=i;
          
            }
        }
        System.out.println("La SUMA es: "+ suma);
        System.out.println("La MULTIPLICACION es: "+ multiplica);
    }
}
