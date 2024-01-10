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
public class Ex12_Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        char opcion;
        
        do {            
            System.out.println("*****MENU*****");
            System.out.println("==============");
            System.out.println("A - [Ex. 01] Contar Vocales");
            System.out.println("B - [Ex. 05] Palindrom");
            System.out.println("C - [Ex. 11] Letra DNI");
            
            opcion = sc.next().charAt(0);
            opcion = Character.toUpperCase(opcion);
            
            switch (opcion) {
                case 'A':
                    System.out.println("Opcion A - Has elegido contar vocales");
                    String frase = sc.nextLine();
                    Ex01_ComptaVocals.contarVocales(frase);
                    break;
                    
                case 'B':
                    System.out.println("Opcion B - Has elegido Palindrom");
                    String fraseB = sc.nextLine();
                    Ex05_Palindrom.palidromo(fraseB);
                    break;
                    
                case 'C':
                    System.out.println("Opcion  C - Has elegido Letra DNI");
                    
                    Ex11_LletraDNI.dni();
                    break;    
                case 'X':
                    System.out.println("Saliendo del MENU");
                    break;   
                default:
                    System.out.println("OPCION INCORRECTA");
            }
        } while (opcion!='X');
        sc.close();
    }
}
