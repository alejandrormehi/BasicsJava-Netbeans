/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bifurcaciones;
import java.util.Scanner;
/**
 *
 * @author newge
 */
public class ex16_UnSegonDespres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una hora");
        int hora = sc.nextInt();
        
        System.out.println("Introduce unos minutos");
        int minutos = sc.nextInt();
        
        System.out.println("Introduce unos segundos");
        int segundos = sc.nextInt();
        
        if(segundos>0){
            segundos +=1;
            if(segundos>=59){
                     minutos +=1;
                     segundos=00;
                } if (minutos>=59){
                     minutos=00;
                     hora +=1;                   
                } if (hora>=24) {
                    hora=00;
                
            }
             System.out.println("Un segundo despues son las: " + String.format("%02d", hora)  + " : " 
                     + String.format("%02d", minutos) + " : " + String.format("%02d", segundos));
        }
        
    }
    
}
