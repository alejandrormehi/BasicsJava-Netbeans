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
public class ex13_ElDelMig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el 1er numero: ");
        
        int primero = sc.nextInt();
        
        System.out.println("Introduce el 2do numero: ");
        
        int segundo = sc.nextInt();
        
        System.out.println("Introduce el 3er numero: ");
        
        int tercero = sc.nextInt();
        
        int medio=0;
        
        if(primero > segundo && primero < tercero){
            
            medio = primero;
            System.out.println("El numero del medio es: " + medio);
            
        } else if(segundo < primero && segundo > tercero){
            
            medio = segundo;
            System.out.println("El numero del medio es: " + medio);

        }else if(tercero > segundo && tercero < primero){
            
            medio = tercero;
            System.out.println("El numero del medio es: " + medio);

        }else {
            System.out.println("Hay numero erroneos");
        }
        
    }
   
}
