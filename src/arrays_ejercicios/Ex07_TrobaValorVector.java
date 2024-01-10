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
public class Ex07_TrobaValorVector {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero natural");
        
        int numero = sc.nextInt();
        
        int vector[] = new int [numero];
        System.out.println("Introduce una lista de "+numero+" valores separados por un espacio");  

        for(int i=0;i<vector.length;i++){
            vector[i]=sc.nextInt();    
        }
        System.out.println("Valor a encontrar: ");
        int find = sc.nextInt();
        
        boolean encontrado = false;
        
        for(int i=0;i<vector.length;i++){
            if(find==vector[i]){
                System.out.println("Numero "+find+ " encontrado en la posicion "+i);
                encontrado=true;              
            }
        }
       
        if(!encontrado){
            System.out.println("El numero "+find+" no se ha encontrado");
        }
    }
}
