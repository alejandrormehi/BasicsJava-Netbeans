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
public class duplica2_DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        double cantidadInicial = 1;
        double cantidad = cantidadInicial;
        double interes = 5;
        int año = 0;
        
        do {
            cantidad += cantidad * interes/100;
            ++año;
        } while (cantidad < 2*cantidadInicial);
        System.out.println("La cantidad inicial es = " + cantidadInicial);
        System.out.println("El interes es = " + interes);
        System.out.println("La cantidad final es: " + cantidad);
        System.out.println("El total de años es " + año);
    
    }
}
