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
public class Ex11_LletraDNI {
    public static void dni() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce tu dni");
        
        int documento = sc.nextInt();
        char letra = ' ';
        
        String opciones = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indexLetra = opciones.indexOf(letra);
        
        int modulo;
                   
        if(documento%23==0){
             modulo=0;
        }else{
             modulo = documento%23;
        }
        
        if(modulo>=0 && modulo<23){
            char c=' ';
            for(int i=0; i<opciones.length();i++){
                c = opciones.charAt(modulo);    
             }  
            System.out.println("El DNI completo es: "+documento+"-"+c);
        }
    }
}
