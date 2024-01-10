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
public class ex17_Divisio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el DIVIDENDO");
        
        int dividendo = sc.nextInt();
        
        System.out.println("Introduce el DIVISOR");
        
        int divisor = sc.nextInt();
        
        double cociente;
        
        if(divisor!=0){
            cociente = (double) dividendo / divisor;
            System.out.println("El cociente es: " + String.format("%.3f%n", cociente));
            
        }else {
            
            System.out.println("El cociente es infinito" );
        }
        
    }
}
