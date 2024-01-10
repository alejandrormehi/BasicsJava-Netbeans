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
public class ex09_calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce 1 numero");
        
        int primero = sc.nextInt();
        
        System.out.println("Introduce el segundo numero");
        
        int segundo = sc.nextInt();
        
        System.out.println("Introduce una operacion ( + , - , * . /): ");
        
        char operador = sc.next().charAt(0);
        
        int resultado = 0;
        
        
        switch (operador) {
            case '+':
                resultado = primero + segundo;
                break;
            case '-':
                resultado = primero - segundo;
                break;
            case '*':
                resultado = primero * segundo;
                break;
            case '/':
                resultado = primero / segundo;
                break;    
            default:
                throw new AssertionError();
        }
        System.out.println("El resultado de la operacion es : " + resultado);
    }
}
