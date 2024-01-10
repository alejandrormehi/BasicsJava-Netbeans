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
public class Ex11_TrobaMajorMenorVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce en una linea, una lista de numeros SEPARADOS por comas");
        
        String valores = sc.nextLine();
        
        // Uso de Split
        
        String[] partes = valores.split("\\s*,\\s*"); // esto divide la cadena usando comas y elimina los espacios
        
        int[] enteros = new int[partes.length];
        
        int maximo=enteros[0];
        int minimo=enteros[0];    
        
        for(int i=0;i<partes.length;i++){
            try{
                enteros[i] = Integer.parseInt(partes[i]);
                
            }catch (NumberFormatException e){
                System.out.println("Error al convertir a entero: " + partes[i]);
            }
             System.out.println(enteros[i]);
             
        }
        
        
        for(int i=0; i<enteros.length;i++){
            if(i==0){
                maximo = enteros[i];
                minimo = enteros[i];         
            }else{
                if(enteros[i]>maximo){
                    maximo=enteros[i];
                }
                if(enteros[i]<minimo){
                    minimo=enteros[i];
                }
            }
        }
             System.out.println("El valor más GRANDE es: "+ maximo);
             System.out.println("El valor más PEQUEÑO es: "+ minimo);
    }
}
