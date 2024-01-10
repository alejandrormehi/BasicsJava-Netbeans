/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;
import java.util.Scanner;
/**
 *
 * @author newge
 */
public class factorial1 {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();
       int factorial = 1;
       
       for(int i=2 ; i <= n; i++){
           factorial*=i; 
       }
        System.out.println("El factorial de " + n );
        System.out.println("es: " + factorial);
    }
}
