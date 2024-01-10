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
public class ex01_paresImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero natural=>");
        int num = sc.nextInt();
        
        if(num%2==0){
            System.out.println("El numero " +num +" es PAR");
        }else{
            System.out.println("El numero " +num +" es IMPAR");
        }
    }
}
