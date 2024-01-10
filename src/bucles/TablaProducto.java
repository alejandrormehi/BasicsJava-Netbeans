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
public class TablaProducto {
    public static void main (String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Danos un numero");
        int valor = sc.nextInt();
              
        System.out.println(" Tabla de multiplicar del " + valor);
        
        for(int i = 1; i <= 10; i++){
            System.out.println(valor + " x " + i + " = " + valor*i);
        }
    
    }
}
