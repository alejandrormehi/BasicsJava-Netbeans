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
public class ex06_mayorDe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un numero ->");       
        int primernum = sc.nextInt();     
        
        System.out.println("Escribe otro numero ->");
        int segundonum = sc.nextInt();
        
        System.out.println("Escribe otro numero por favor->");    
        int tercernum = sc.nextInt();
        int mayor;
 
        
        if(primernum > segundonum && primernum>tercernum){
             mayor = primernum;
            System.out.println("El mayor numero introducido es: " + mayor);
        }else if (segundonum>primernum && segundonum>tercernum) {
            mayor = segundonum;
            System.out.println("El mayor numero introducido es: " + mayor);

        }else if (tercernum>primernum && tercernum>segundonum){
            mayor = tercernum;
            System.out.println("El mayor numero introducido es: " + mayor);

        }else{
            System.out.println("Todos los numeros son iguales");
        }
        
    }
}
