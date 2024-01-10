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
public class ex05_numCrecientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un numero ->");
        
        int num1 = sc.nextInt();
        
        System.out.println("Escribe otro numero ->");
        
        int num2 = sc.nextInt();
        
        if(num1>num2){
            int primero = num2;
            int segundo = num1;
            System.out.println("Tus numeros en orden creciente son: " + primero +" , "+segundo);
        }else if (num2>num1){
            int primero = num1;
            int segundo = num2;
            System.out.println("Tus numeros en orden creciente son: " + primero +" , "+segundo);

        }else{
            System.out.println("Son iguales");
        }
        
        
        
        
    }
}
