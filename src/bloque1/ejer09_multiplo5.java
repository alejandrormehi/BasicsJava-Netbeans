/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloque1;
import java.util.Scanner;
/**
 *
 * @author newge
 */
public class ejer09_multiplo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un numero ->");
        
        int numero = sc.nextInt();
        
        if(numero%5==0){
            System.out.println("El numero " + numero + " es multiplo de 5");
        }else{
            System.out.println("No es multiplo de 5");
        }
        
    }
}
