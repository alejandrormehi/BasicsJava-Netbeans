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
public class ex14_facturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Iniciando programa de gestion de facturas...");
    
        System.out.println("Ingresa tu factura");
        int cantPropietarios=0;
        int propietarios20 = 0;
        int propietarios35 = 0;
        int propietarios50 = 0;
        
        int sumatoria=0;
        
        for(int i=0; i<10;i++){
            int factura=sc.nextInt();
            cantPropietarios=1;
            
                    sumatoria+=factura;
                if(factura>0 && factura<60 ){
                    propietarios20++;
                    cantPropietarios++;
                    System.out.println("Tu impuesto es de 20 euros");
                    
                }else if (factura>=60 && factura<90){
                    propietarios35++;
                    cantPropietarios++;
                    System.out.println("Tu impuesto es de 35 euros");
                    
                }else if (factura>=90){
                    propietarios50++;
                    cantPropietarios++;
                    System.out.println("Tu impuesto es de 50 euros");
                    
                }else{
                    System.out.println("El valor ingresado es INCORRECTO");
                }
                
            }
            System.out.println("En total, hay la cantidad de " +propietarios20 + " propietarios que pagaran 20 euros" );
            System.out.println("En total, hay la cantidad de " +propietarios35 + " propietarios que pagaran 35 euros" );
            System.out.println("En total, hay la cantidad de " +propietarios50 + " propietarios que pagaran 50 euros" );
            System.out.println("El total de impuestos que pagaran es de: " +  sumatoria);

 

            
        
    
    }
}
