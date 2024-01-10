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
public class ex7_test {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Introduce una cadena de caracteres: ");
        String cadena = sc.nextLine();
        String fraseCambiada="";
        
        boolean esPrimeraLetra = true;
        
        for(int i=0; i<cadena.length();i++){    
          
          char c= cadena.charAt(i);

          if(esPrimeraLetra && Character.isLowerCase(c)){
             c=Character.toUpperCase(c);
             esPrimeraLetra=false;
          }else if(c==' '){
              esPrimeraLetra=true;
          }
          fraseCambiada+=c;
        } 
        System.out.println("La frase cambiada es");
        System.out.println(fraseCambiada);
    }
}