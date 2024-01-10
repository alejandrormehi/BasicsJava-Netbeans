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
public class Ex08_SubstitueixAsterisc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una frase y algun '*' ");       
        String frase = sc.nextLine();
        
        System.out.println("Ahora introduce un sustituto");
        String sustituto = sc.nextLine();
      
        int indexCaracter = frase.indexOf('*');

    /* Este while indica que el caracter este dentro de una cadena String */
        while(indexCaracter != -1){
    /* Ahora dividiremos la String origina en 2 partes, 1 antes y otra despues*/
        String partAntes = frase.substring(0, indexCaracter);
        String partDespues = frase.substring(indexCaracter+1);
        
        frase = partAntes + sustituto + partDespues;
        
        indexCaracter = frase.indexOf('*', indexCaracter + sustituto.length());
        }
        System.out.println(frase);
        
    }
}
