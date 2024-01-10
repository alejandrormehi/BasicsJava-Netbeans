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
public class ex15_DiaMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un mes");
        
        int mes = sc.nextInt();
        int dias;
        switch (mes) {
                case 1:
                dias = 31;
                    System.out.println("El mes: " + mes + " tiene " + dias);
                break;
                
                case 2:
                dias = 28;
                System.out.println("El mes: " + mes + " tiene " + dias);
                break;
                
                case 3:
                dias = 31;
                System.out.println("El mes: " + mes + " tiene " + dias);
                break;
                
                case 4:
                dias = 30;
                System.out.println("El mes: " + mes + " tiene " + dias);
                break;
                
                case 5:
                dias = 31;
                System.out.println("El mes: " + mes + " tiene " + dias);
                break;
                
                case 6:
                dias = 30;
                System.out.println("El mes: " + mes + " tiene " + dias);
                break;
                
                case 7:
                dias = 31;
                System.out.println("El mes: " + mes + " tiene " + dias);
                break;
                
                case 8:
                dias = 30;
                System.out.println("El mes: " + mes + " tiene " + dias);
                break;
                
                case 9:
                dias = 31;
                System.out.println("El mes: " + mes + " tiene " + dias);
                break;
                
                case 10:
                dias = 30;
                System.out.println("El mes: " + mes + " tiene " + dias);
                break;
                
                case 11:
                dias = 31;
                System.out.println("El mes: " + mes + " tiene " + dias);
                break;
                
                case 12:
                dias = 30;
                System.out.println("El mes: " + mes + " tiene " + dias);
                break;
                
                
            default:
                System.out.println("ERROR, has introducido un mes incorrecto");
        }
        
    }
}
