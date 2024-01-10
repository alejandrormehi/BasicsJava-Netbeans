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
public class ex14_TresNombresCreixents {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el 1er numero: ");
        
        int primero = sc.nextInt();
        
        System.out.println("Introduce el 2do numero: ");
        
        int segundo = sc.nextInt();
        
        System.out.println("Introduce el 3er numero: ");
        
        int tercero = sc.nextInt();
        

        
        if(primero <= segundo && primero<=tercero){
            if(segundo<=tercero){
                System.out.println("El orden es: "+primero+" <- "+segundo+" <- "+tercero);
            }else {
                System.out.println("El orden es: "+primero+" <- "+tercero+" <- "+segundo);
            }
        }
        else if(segundo<=primero && segundo <= tercero){
              if(primero<=tercero){
                    System.out.println("El orden es: "+segundo+"<-"+primero+"<-"+tercero);
            }else{
                System.out.println("El orden es: "+segundo+"<-"+tercero+"<-"+primero);
        }
        }else {
            if(primero<=segundo){
                System.out.println("El orden es: "+tercero+"<-"+primero+"<-"+segundo);
            }else{
                System.out.println("El orden es: "+tercero+"<-"+segundo+"<-"+primero);
            }
        }
               
    }
}
