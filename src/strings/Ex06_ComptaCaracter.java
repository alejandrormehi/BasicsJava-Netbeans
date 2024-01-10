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
public class Ex06_ComptaCaracter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una cadena de caracteres: ");
        String cadena = sc.nextLine().toLowerCase();
        
        System.out.println("Ahora introduce un caracter: ");
        char caracter = sc.next().charAt(0);
        
        int aparece =0;
        
        for(int i=0; i<cadena.length();i++){
          char c= cadena.charAt(i);
            
          if(c==caracter){
              aparece++;
          }
        }
         System.out.println("El caracter "+caracter + " aparece un total de " + aparece + " veces");

        
                
    }
}
