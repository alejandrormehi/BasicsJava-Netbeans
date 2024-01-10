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
public class Ex10_NomesLletresEspais {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una frase que contenga");
        
        String frase = sc.nextLine();
        
      
        String nuevaFrase ="";
        
        for(int i=0; i<frase.length(); i++){
            char c = frase.charAt(i);
            
            if(Character.isLetter(c)|| c==' '){
                nuevaFrase+=c;
            }else{
                nuevaFrase += " ";
            }
            
          
        }
        System.out.println(nuevaFrase);
    }
}
