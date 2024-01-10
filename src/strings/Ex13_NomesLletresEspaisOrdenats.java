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
public class Ex13_NomesLletresEspaisOrdenats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una frase a ordenar");
        
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String frase = sc.nextLine();   
        String espacios ="";
        String fraseMayusculas="";
        String nuevaFrase = "";
        String frasePreFinal = "";
        String fraseFinal = "";
        
        char letra = ' ';
        
        int cuentaEspacios=0;

        for(int i=0; i<frase.length(); i++){
            char c = frase.charAt(i);
            
            if(Character.isLetter(c)|| c==' '){
                nuevaFrase+=c;
                if(c== ' '){
                    cuentaEspacios++;
                }
            }else{
                nuevaFrase += " ";
            }
         }   
        /*Etapa de acumular los espacios en una String*/
        for(int e=0;e<cuentaEspacios;e++){
            espacios+=" ";
        }
        /*Etapa de quitar los espacios*/
        for(int j=0 ; j<nuevaFrase.length(); j++){
            char nuevaLetra = nuevaFrase.charAt(j);
            
            if(Character.isLetter(nuevaLetra)){
                frasePreFinal+=nuevaLetra;
            } 
        }
        /*Etapa de crear la frase de mayusculas*/
         for(int m=0 ; m<ABC.length();m++){
            char letraABC = ABC.charAt(m);
            
            for(int y=0 ; y<frasePreFinal.length(); y++){
                char letraFinalMayus = frasePreFinal.charAt(y);
                
                if(letraFinalMayus==letraABC){
                    fraseMayusculas+=letraFinalMayus;
                }
            }
        }
        
        /*Etapa de ordenar la oracion*/
        for(int k=0 ; k<abc.length();k++){
            char letraabc = abc.charAt(k);
            
            for(int z=0 ; z<frasePreFinal.length(); z++){
                char letraFinal = frasePreFinal.charAt(z);
                
                if(letraFinal==letraabc){
                    fraseFinal+=letraFinal;
                }
            }
        }
        System.out.println("'"+fraseMayusculas+","+fraseFinal+espacios+"'");
      
           
        
    }
}
