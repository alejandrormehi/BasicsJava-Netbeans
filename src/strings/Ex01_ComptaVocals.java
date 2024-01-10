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
public class Ex01_ComptaVocals {
    public static void contarVocales(String frase) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe una frase...");
        
        frase = sc.nextLine();
        int contador=0;
        
        for(int i=0;i<frase.length();i++){
        /* Character.toLoweCase, coge de la String "frase" cada elemento y lo pone en minusculas*/
           char c = Character.toLowerCase(frase.charAt(i));
           if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u'){
            contador++;
            }
        
        }
            System.out.println("La frase tiene "+contador + " vocales");

    }
}
