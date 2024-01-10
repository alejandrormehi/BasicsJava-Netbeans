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
public class Ex03_ComptaMajusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase para analizar");
        
        String frase = sc.nextLine();
        int contMayus = 0;
        int contMinus = 0;
        int otros = 0;
        for(int i=0; i<frase.length();i++){
 
            char c= frase.charAt(i);
            
            if(Character.isUpperCase(c)){
                contMayus++;
            }else if(Character.isLowerCase(c)){
                contMinus++;
            } else if(c == ' ' || c == '\u00A1' || c == '\u00BF' || c == '\u00E1' || c == '\u00E9' || c == '\u00ED' || c == '\u00F3' || c == '\u00FA' || c == '\u00FC' || c == '\u00C1' || c == '\u00C9' || c == '\u00CD' || c == '\u00D3' || c == '\u00DA' || c == '\u00DC') {
                otros++;
            }

        }
        System.out.println("En la frase hay " + contMayus+ " mayusculas");
        System.out.println("En la frase hay " + contMinus+ " minusculas");
        System.out.println("En la frase hay " + otros+ " otros caracteres");
    }
}
