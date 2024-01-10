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
public class ex16_secuencia0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hagamos una secuencia, esta termina cuando pongas un '0'");
        int num;
        int cantPrim = 0;
        
        do{
            System.out.println("Ingresa un numero: ");
            num=sc.nextInt();
            boolean primo = true;
            //Un numero primo es aquel que solo se puede dividir entre 1 y el mismo, por ello empezamos la condicional
            // determinando si es mayor a 1, luego empezando el bucle FOR en 2 y terminando 1 valor anterior al numero 
            if (num>1) {
                for(int i=2; i<num;i++){
                    if(num%i==0){
                        primo = false;
                        System.out.println("El numero ingresado no es primo");
                        break;
                    }
                }   
            }else{
                primo= false;
                System.out.println("El numero ingresado no es primo");
            }if(primo && num!=0){
                cantPrim++;
            }
        }while(num!=0);
        System.out.println("En total hay "+cantPrim+" numeros primos");
        
        
        
    }
}
