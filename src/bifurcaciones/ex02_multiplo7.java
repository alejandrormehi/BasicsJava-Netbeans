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
public class ex02_multiplo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero natural=>");
        int num = sc.nextInt();
        
        if(num%7==0){
            System.out.println("El numero " +num +" SI es multiplo de 7");
        }else{
            System.out.println("El numero " +num +" NO es multiplo de 7");
        }
    }
}
