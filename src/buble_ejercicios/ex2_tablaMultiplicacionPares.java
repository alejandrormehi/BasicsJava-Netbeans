/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buble_ejercicios;
import java.util.Scanner;
/**
 *
 * @author newge
 */
public class ex2_tablaMultiplicacionPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Danos un numero: ");
        
        int num = sc.nextInt();
        
        if(num%2==0){
        System.out.println("Tabla del: " + num);

        for(int i=0; i<=12;i++){
            int resultado = num*i;
            
            System.out.println(i+" * "+num+" = "+resultado);
        }
        }else{
            System.out.println("ELIGE UN NUMERO PAR");
        }
        
    }
}
