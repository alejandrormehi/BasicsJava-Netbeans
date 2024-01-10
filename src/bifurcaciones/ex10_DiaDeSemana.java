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
public class ex10_DiaDeSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
        
        int numero = sc.nextInt();
        
        String dia;
        
        switch (numero) {
            case 1:
                dia = "Lunes";
                break;
                
            case 2:
                dia = "Martes";
                break;
                
            case 3:
                dia = "Miercoles";
                break;
                
            case 4:
                dia = "Jueves";
                break;
                
            case 5:
                dia = "Viernes";
                break;
                
            case 6:
                dia = "Sabado";
                break; 
                
            case 7:
                dia = "Domingo";
                break;    
            default:
                throw new AssertionError();
        }
        System.out.println("El dia equivalente es: " + dia);
    }
}
