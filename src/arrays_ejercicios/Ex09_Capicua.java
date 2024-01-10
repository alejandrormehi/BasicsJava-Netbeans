/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_ejercicios;
import java.util.Scanner;
/**
 *
 * @author newge
 */
public class Ex09_Capicua {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num ;
        String cantCifras;
    
        boolean esNumero = false;
        
        
        while(!esNumero){
            
            System.out.println("Introduce un numero");
 
            if(sc.hasNextInt()){
                
                num = sc.nextInt();
                esNumero = true;
                
                cantCifras = String.valueOf(num);
                int longitud = cantCifras.length();
                
                int [] numero = new int [longitud];             
                
                System.out.println("La cantidad de cifras es: "+longitud);
                
                int indice = longitud-1;
                
                    while(num>0){
                        numero[indice]=num%10;
                        num/=10;
                        indice--;
                    }
                    
                    boolean esCapicua =true;
                    
                    for(int i=0; i<numero.length/2;i++){
                    if(numero[i]!=numero[numero.length-1-i]){
                        esCapicua = false;
                        break;
                    }
            }
                                 
                for(int i=0; i<numero.length;i++){
                    
                    System.out.println("Cifra "+(i+1)+ " : "+numero[i]);
                    
                }
                if(esCapicua){
                        System.out.println("Es capicua");
                    }else{
                        System.out.println("No es capicua");
                    }
                
            }else{
                System.out.println("No es int");
                sc.next();
            }
            
        }   
    }
}
