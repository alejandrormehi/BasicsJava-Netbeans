/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debugging;
import java.util.Scanner;

/**
 *
 * @author newge
 */
public class Ex14_EndevinaAmbPistes {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        final int MAX = 10;
        System.out.println("He pensat un nombre entre 1 i " + MAX + 
                                                     ". Prova d’endevinar-ho!");
        
        int n = (int)(Math.random()*MAX + 1);
        int comptador = 0;
        while (true)
        {
            System.out.print("Resposta: ");
            int valorEntrat = entrada.nextInt();
            if (valorEntrat < n){
                comptador++;
                System.out.println("Incorrecte, el nombre és MAYOR. Prova de nou");
                
            }else if (valorEntrat > n){
                    comptador++;
            System.out.println("Incorrecte, el nombre és MENOR. Prova de nou");
              }else
            {
                System.out.println("Correcte!");
                break;
            }            
        }
        System.out.println("Has necessitat " + comptador + " intents per " +
                                                        "endevinar el nombre.");
    }
}