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
public class ejer10_cocienteYresiduo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un numero ->");
        
        int primernum = sc.nextInt();
        
        System.out.println("Escribe otro numero ->");
        
        int segundonum = sc.nextInt();
        
        double cociente=primernum/segundonum;
        int residuo=(primernum%segundonum);
        
       
        System.out.println("El cociente de los numeros ingresados es: " + String.format("%.3f",cociente));
        System.out.println("El residuo de la division es: " + residuo );
        
        
        
        
        
        
    }
}
