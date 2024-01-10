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
public class ex03_multiploEntreDosNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un numero ->");
        
        int primernum = sc.nextInt();
        
        System.out.println("Escribe otro numero ->");
        
        int segundonum = sc.nextInt();
        
        if(primernum%segundonum==0 || segundonum%primernum==0){
            System.out.println("El numero " + primernum + " Y el numero " + segundonum + " SON multiplos entre ellos" );
        }else{
            System.out.println("NO SON MULTIPLOS");
        }
        
    }
}
