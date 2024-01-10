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
public class ex12_AnyDeTraspas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un año: ");
        
        int año = sc.nextInt();
        
        if(año%400==0){
            System.out.println("El año " + año + " SI es de traspaso");
        }else if(año%100==0){
            System.out.println("El año " + año + " NO es de traspaso");
        }     else if(año%4==0){
            System.out.println("El año " + año + " SI es de traspaso");
        }else{ 
            System.out.println("El año " + año + " NO es de traspaso");
        }
    }
}
