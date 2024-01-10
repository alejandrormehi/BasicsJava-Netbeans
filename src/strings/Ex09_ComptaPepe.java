/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;
import java.util.Scanner;
/**
 *
 * @author newge
 */
public class Ex09_ComptaPepe {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);   
  
        System.out.println("Introduce una frase que contenga 'pepe'");
        String frase = sc.nextLine();
        
        String palabraBuscada = "pepe";
        int indexFrase = frase.indexOf(palabraBuscada);
        int contador=0;
        
        while(indexFrase != -1){
          
            contador++; 
            indexFrase = frase.indexOf(palabraBuscada,indexFrase+1);
        }
         System.out.println("Hay " +contador + " pepes");

    }
}
