/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;
import java.util.Scanner;
/**
 *
 * @author newge
 */
public class Ex04_InvertirCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escrie una cadena de caracteres...");
        
        String cadena = sc.nextLine();
        String revez="";
        for(int i=cadena.length()-1; i>=0;i--){
           revez+=cadena.charAt(i);

        }
        System.out.println("La cadena invertida es: " +revez);
    }
}
