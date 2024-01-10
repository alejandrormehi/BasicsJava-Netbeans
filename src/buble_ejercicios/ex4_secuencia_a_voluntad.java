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
public class ex4_secuencia_a_voluntad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        double mayor = Integer.MIN_VALUE;
        double menor = Integer.MAX_VALUE;
        double suma = 0;
        System.out.println("Elige cuantos numero mandarás: ");
        int numero =sc.nextInt();
        
        System.out.println("Muy bien, has elegido " + numero + " Intentos");

        int intentos=0;
        
        while (intentos<numero) {            
            int num = sc.nextInt();
            intentos++;
                System.out.println("Número ingresado: " + num);

            suma+=num;
            
            if(num>mayor){
                mayor=num;
            }
            if (num<menor) {
                menor = num;
                
            }
        }
        
        double media = (double)suma/intentos;
        System.out.println("El MAYOR es: "+mayor);
        System.out.println("El MENOR es: "+menor);
        System.out.println("La MEDIA es: "+ media);
        
    }
}
