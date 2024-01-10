/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_ejercicios;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author newge
 */
public class Ex08_FrequenciesNotes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int notas [] = new int [10];
        int nota;
        int contador = 0;
        
        System.out.println("Introdueix una nota (de 0 a 10, o un valor diferent per sortir): ");
   
        while(contador < 10){
            
        if(sc.hasNextInt()){
            
            System.out.println("Introdueix una nota (de 0 a 10, o un valor diferent per sortir): ");
             nota = sc.nextInt();
             
             if(nota>=0 && nota <=10){
                 
                notas[contador] = nota;
                contador++;
                
                }else{
                    System.out.println("Error, valor no ideal");
                }
             
            }else{
                System.out.println("Error, valor no ideal");
                sc.next();
            }
        }  
        System.out.println("\nLista de notas ingresadas");
        for(int i =0; i<=10;i++){
            int contaNota = 0;
           for(int j=0;j<notas.length;j++){
               
           
            if(notas[j]==i){
                contaNota++;
             }
            }
              if(contaNota>=0){
                System.out.println("La nota " + i + " aparece " + contaNota+ " veces");
            }
        }
        
    }
}
