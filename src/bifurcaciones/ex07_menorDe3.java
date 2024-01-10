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
public class ex07_menorDe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un numero ->");       
        int primernum = sc.nextInt();     
        
        System.out.println("Escribe otro numero ->");
        int segundonum = sc.nextInt();
        
        System.out.println("Escribe otro numero por favor->");    
        int tercernum = sc.nextInt();
        int menor;
 
        
        if(primernum < segundonum && primernum<tercernum){
             menor = primernum;
            System.out.println("El MENOR numero introducido es: " + menor);
        }else if (segundonum<primernum && segundonum<tercernum) {
            menor = segundonum;
            System.out.println("El MENOR numero introducido es: " + menor);

        }else if (tercernum<primernum && tercernum<segundonum){
            menor = tercernum;
            System.out.println("El MENOR numero introducido es: " + menor);

        }else{
            System.out.println("Todos los numeros son iguales");
        }
    }
}
