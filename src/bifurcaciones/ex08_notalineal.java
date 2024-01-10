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
public class ex08_notalineal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Asigna una nota a tu alumno ->");       
        int nota = sc.nextInt();
        
        if(nota>=0 && nota<3){
            System.out.println("El literal de la nota és MOLT DEFICIENT");
        }else if(nota>2 && nota<5){
            System.out.println("El literal de la nota és INSUFICIENTE");
        }else if(nota==5){
            System.out.println("El literal de la nota és SUFICIENTE");
        }else if(nota==6){
            System.out.println("El literal de la nota és BUENO");
        }else if(nota>6 && nota<9){
            System.out.println("El literal de la nota és NOTABLE");
        }else if(nota>=9 && nota==10){
            System.out.println("El literal de la nota és EXCELENTE");
        }else{
            System.out.println("Introduce una nota valida");
        }
    }
}
