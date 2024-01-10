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
public class Ex05_Palindrom {
    public static void palidromo(String frase) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una frase");
        
        frase = sc.nextLine().replaceAll("[^A-Za-z]", "").toLowerCase();
        String revez="";
        char caracter;
        
        for(int i=frase.length()-1; i>=0;i--){
           // caracter=frase.charAt(i);
            revez+=frase.charAt(i);
           
        }
         if(frase.equals(revez)){
             System.out.println("SI, son palidromos");       
           }else{
            System.out.println("NO lo son");
         }
    }
}
