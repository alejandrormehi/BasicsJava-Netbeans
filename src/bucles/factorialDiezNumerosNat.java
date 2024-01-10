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
public class factorialDiezNumerosNat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String respuesta;
        System.out.println("Te mostraremos el factorial de los primeros 10 numeros naturales a continuacion si dices que si");
        
        respuesta = sc.nextLine();
        
        if (respuesta.equalsIgnoreCase("si")) {
            
            for(int i = 1; i<=10;i++){
                int factorial =1;
                for(int k=2;k<=i;k++){
                    factorial*=k;
                    
                }
                System.out.println("El factorial de "+ i + " es " + factorial);
            }
        }else{
            System.out.println("Adios");
        }
    }
   
}
